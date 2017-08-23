package com.company.qts.thedementiatest.helper;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.company.qts.thedementiatest.R;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by MyPC on 24/07/2017.
 */
public class QTSHelp {

    private static final float MAX_IMAGE_DIMENSION = 1280;

    //check internet
    public static boolean checkInternet(Context context){
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    //show Toast
    public static void showToast(Context context, String str_message) {
        Toast toast = Toast.makeText(context, str_message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 50);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }
    //show Toast Long
    public static void showToastLong(Context context, String str_message) {
        Toast toast = Toast.makeText(context, str_message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 50);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
    // /////////////////////////// Width device
    public static int GetWidthDevice(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("width_device", 480);
    }

    public static void SetWidthDevice(Context context, int num) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("width_device", num);
        editor.commit();
    }
    // /////////////////////////// Height device
    public static int GetHeightDevice(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("height_device", 480);
    }

    public static void SetHeightDevice(Context context, int num) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("height_device", num);
        editor.commit();
    }
    //set size  for view
    public static void setLayoutView(View view, int width, int height) {
        view.getLayoutParams().width = width;
        view.getLayoutParams().height = height;
    }
    //dialog
    public static void showpPopupMessage(Activity activity, String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(activity);
        dialog.setMessage(message);
        dialog.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                return;
            }
        });
        AlertDialog alert = dialog.create();
        alert.show();
    }

    //check mail
    public static boolean checkEmailCorrect(String Email) {
        String pttn = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        Pattern p = Pattern.compile(pttn);
        Matcher m = p.matcher(Email);

        if (m.matches()) {
            return true;
        }
        return false;
    }

    public static String getHospital(Context context) {
        SharedPreferences sharedPre = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, Context.MODE_PRIVATE);
        return sharedPre.getString("hospital", "");
    }

//    // Save image to internal memory
//    public static boolean saveImageToInternalStorage(Context context, Bitmap image, String name) {
//        try {
//            // Use the compress method on the Bitmap object to write image to
//            // the OutputStream
//            FileOutputStream fos = context.openFileOutput(name, Context.MODE_PRIVATE);
//
//            // Writing the bitmap to the output stream
//            image.compress(Bitmap.CompressFormat.PNG, 100, fos);
//            fos.close();
//
//            return true;
//        } catch (Exception e) {
//            Log.e("saveToInternalStorage()", e.getMessage());
//            return false;
//        }
//    }
//
//    public static boolean saveImageToSDCard(Bitmap image, String folder, String name) {
//        String fullPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + folder + "/";
//
//        try {
//            File dir = new File(fullPath);
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//
//            OutputStream fOut = null;
//            File file = new File(fullPath, name);
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            fOut = new FileOutputStream(file);
//
//            // 100 means no compression, the lower you go, the stronger the compression
//            image.compress(Bitmap.CompressFormat.PNG, 100, fOut);
//            fOut.flush();
//            fOut.close();
//
//            //MediaStore.Images.Media.insertImage(this.getContentResolver(), file.getAbsolutePath(), file.getName(), file.getName());
//            return true;
//
//        } catch (Exception e) {
//            Log.e("saveToExternalStorage()", e.getMessage());
//            return false;
//        }
//    }
    public static int checkRotation(Uri uri) throws IOException {
        ExifInterface ei = new ExifInterface(uri.getPath());
        int orientation = ei.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
        switch (orientation) {
            case ExifInterface.ORIENTATION_ROTATE_90:
                return 90;
            case ExifInterface.ORIENTATION_ROTATE_180:
                return 180;
            case ExifInterface.ORIENTATION_ROTATE_270:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap scaleDown(Bitmap realImage, boolean filter) {
        float ratio = Math.min(
                (float) MAX_IMAGE_DIMENSION / realImage.getWidth(),
                (float) MAX_IMAGE_DIMENSION / realImage.getHeight());
        int width = Math.round((float) ratio * realImage.getWidth());
        int height = Math.round((float) ratio * realImage.getHeight());

        Bitmap newBitmap = Bitmap.createScaledBitmap(realImage, width,
                height, filter);
        return newBitmap;
    }

    public static Bitmap rotateImage(Bitmap source, float angle) {
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        return Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix,
                true);
    }

    public static Bitmap scaleImage(Context context, Uri photoUri) throws IOException, FileNotFoundException {
        InputStream is = context.getContentResolver().openInputStream(photoUri);
        BitmapFactory.Options dbo = new BitmapFactory.Options();
        dbo.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(is, null, dbo);
        is.close();

        int rotatedWidth, rotatedHeight;
        int orientation = getOrientation(context, photoUri);

        if (orientation == 90 || orientation == 270) {
            rotatedWidth = dbo.outHeight;
            rotatedHeight = dbo.outWidth;
        } else {
            rotatedWidth = dbo.outWidth;
            rotatedHeight = dbo.outHeight;
        }

        Bitmap srcBitmap;
        is = context.getContentResolver().openInputStream(photoUri);
        if (rotatedWidth > MAX_IMAGE_DIMENSION || rotatedHeight > MAX_IMAGE_DIMENSION) {
            float widthRatio = ((float) rotatedWidth) / ((float) MAX_IMAGE_DIMENSION);
            float heightRatio = ((float) rotatedHeight) / ((float) MAX_IMAGE_DIMENSION);
            float maxRatio = Math.max(widthRatio, heightRatio);

            // Create the bitmap from file
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = (int) maxRatio;
            srcBitmap = BitmapFactory.decodeStream(is, null, options);
        } else {
            srcBitmap = BitmapFactory.decodeStream(is);
        }
        is.close();

        /*
         * if the orientation is not 0 (or -1, which means we don't know), we
         * have to do a rotation.
         */
        if (orientation > 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(orientation);

            srcBitmap = Bitmap.createBitmap(srcBitmap, 0, 0, srcBitmap.getWidth(),
                    srcBitmap.getHeight(), matrix, true);
        }

        String type = context.getContentResolver().getType(photoUri);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        if (type.equals("image/png")) {
            srcBitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        } else if (type.equals("image/jpg") || type.equals("image/jpeg")) {
            srcBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        }
        byte[] bMapArray = baos.toByteArray();
        baos.close();
        return BitmapFactory.decodeByteArray(bMapArray, 0, bMapArray.length);
    }

    public static int getOrientation(Context context, Uri photoUri) {
        /* it's on the external media. */
        Cursor cursor = context.getContentResolver().query(photoUri,
                new String[] { MediaStore.Images.ImageColumns.ORIENTATION }, null, null, null);

        if (cursor.getCount() != 1) {
            return -1;
        }

        cursor.moveToFirst();
        return cursor.getInt(0);
    }
// Set and get username
    public static void setUsername(Context context, String username) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Username", username);
        editor.commit();
    }
    public static String getUsername(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("Username", "Not found");
    }
    //Set and get password
    public static void setPassword(Context context, String password) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Password", password);
        editor.commit();
    }
    public static String getPassword(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("Password", "Not found");
    }
    // Check INTERNET connection
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    //set and get color
    public static void setColor(Context context, int color) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("Color", color);
        editor.commit();
    }
    public static int getColor(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("Color", R.color.colorAccent);
    }
//    public static int Getnum(Context context) {
//        int mode = Activity.MODE_PRIVATE;
//        SharedPreferences sharedPreferences = context.getSharedPreferences(
//                LakConst.PREFERENCES, mode);
//        return sharedPreferences.getInt("numrate", 0);
//    }
//
//    public static void Setnum(Context context, int num) {
//        SharedPreferences sharedPreferences = context.getSharedPreferences(
//                LakConst.PREFERENCES, 0);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putInt("numrate", num);
//        editor.commit();
//    }

    //hide keyboard
    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    //set and get login yes/no
    public static boolean getIsLogin(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getBoolean("islogin", false);
    }
    public static void setIsLogin(Context context, boolean islogin) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("islogin", islogin);
        editor.commit();
    }

    //set and get number color
    public static void setNumColor(Context context, int num) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("Color", num);
        editor.commit();
    }
    public static int getNumColor(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("Color", -1);
    }
    //set and get num
    public static void setNum(Context context, int number) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("number", number);
        editor.commit();
    }
    public static int getNum(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("number", -1);
    }

    public static String convertPassMd5(String pass) {
        String password = null;
        MessageDigest mdEnc;
        try {
            mdEnc = MessageDigest.getInstance("MD5");
            mdEnc.update(pass.getBytes(), 0, pass.length());
            pass = new BigInteger(1, mdEnc.digest()).toString(16);
            while (pass.length() < 32) {
                pass = "0" + pass;
            }
            password = pass;
        } catch (NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        }
        return password;
    }

    private static boolean isValidEmaillId(String email){

        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches();
    }
//Examination
    //Name
    public static void setName(Context context, String name) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", name);
        editor.commit();
    }
    public static String getName(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("name", "null");
    }
    //Is Person Alert
    public static void setIsPerSon(Context context, int isperson) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("isperson", isperson);
        editor.commit();
    }
    public static int getIsPerSon(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("isperson", -1);
    }
    //date of birth
    public static void setDateOfBirth(Context context, String date) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("date", date);
        editor.commit();
    }
    public static String getDateOfBirth(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("date", "null");
    }
    //leve of education
    public static void setLevelOfEducation(Context context, String lv) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("lv", lv);
        editor.commit();
    }
    public static String getLevelOfEducation(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("lv", "null");
    }
    //Sex
    public static void setSex(Context context, int sex) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("sex", sex);
        editor.commit();
    }
    public static int getSex(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("sex", -1);
    }
    //Age
    public static void setAge(Context context, String age) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("age", age);
        editor.commit();
    }
    public static String getAge(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("age", "null");
    }
    //Work
    public static void setWork(Context context, String work) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("work", work);
        editor.commit();
    }
    public static String getWork(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("work", "null");
    }
    //Ethnicity
    public static void setEthnicity(Context context, String ethnicity) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("ethnicity", ethnicity);
        editor.commit();
    }
    public static String getEthnicity(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("ethnicity", "null");
    }
//orientation
    //what day
    public static void setWhatday(Context context, int whatday) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("whatday", whatday);
        editor.commit();
    }
    public static int getWhatday(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("whatday", -1);
    }
    //what month
    public static void setWhatMonth(Context context, int whatmonth) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("whatmonth", whatmonth);
        editor.commit();
    }
    public static int getWhatMonth(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("whatmonth", -1);
    }
    //year
    public static void setYear(Context context, int year) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("year", year);
        editor.commit();
    }
    public static int getYear(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("year", -1);
    }
    //what sate
    public static void setWhatSate(Context context, int whatsate) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("whatsate", whatsate);
        editor.commit();
    }
    public static int getWhatSate(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("whatsate", -1);
    }
    //who is
    public static void setWhois(Context context, int whois) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("whois", whois);
        editor.commit();
    }
    public static int getWhois(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("whois", -1);
    }
//Attention
    //Imgoing
    public static void setImGoing(Context context, int imgoing) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("imgoing", imgoing);
        editor.commit();
    }
    public static int getImGoing(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("imgoing", -1);
    }
    //nowsay
    public static void setNowSay(Context context, int nowsay) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("nowsay", nowsay);
        editor.commit();
    }
    public static int getNowSay(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("nowsay", -1);
    }
    //93
    public static void set93(Context context, int chinba) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("chinba", chinba);
        editor.commit();
    }
    public static int get93(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("chinba", -1);
    }
    //72
    public static void set72(Context context, int bayhai) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("bayhai", bayhai);
        editor.commit();
    }
    public static int get72(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("bayhai", -1);
    }
    //86
    public static void set86(Context context, int tamsau) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("tamsau", tamsau);
        editor.commit();
    }
    public static int get86(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("tamsau", -1);
    }
    //65
    public static void set65(Context context, int saulam) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("saulam", saulam);
        editor.commit();
    }
    public static int get65(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("saulam", -1);
    }
    //79
    public static void set79(Context context, int baychin) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("baychin", baychin);
        editor.commit();
    }
    public static int get79(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("baychin", -1);
    }
//IMMEDIATE RECALL
    //listento
    public static void setListento(Context context, int listento) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("listento", listento);
        editor.commit();
    }
    public static int getListento(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("listento", -1);
    }
//Language
    //beginningwith
    public static void setBeginningWith(Context context, int beginningwith) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("beginningwith", beginningwith);
        editor.commit();
    }
    public static int getBeginningWith(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("beginningwith", -1);
    }
    //thecat
    public static void setTheCat(Context context, int thecat) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("thecat", thecat);
        editor.commit();
    }
    public static int getTheCat(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("thecat", -1);
    }
    //steveis
    public static void setSteveis(Context context, int steveis) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("steveis", steveis);
        editor.commit();
    }
    public static int getSteveis(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("steveis", -1);
    }
//Fluidity
    //animals04
    public static void setAnimals04(Context context, int animals04) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("animals04", animals04);
        editor.commit();
    }
    public static int getAnimals04(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("animals04", -1);
    }
    //animals59
    public static void setAnimals59(Context context, int animals59) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("animals59", animals59);
        editor.commit();
    }
    public static int getAnimals59(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("animals59", -1);
    }
    //animals1015
    public static void setAnimals1015(Context context, int animals1015) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("animals1015", animals1015);
        editor.commit();
    }
    public static int getAnimals1015(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("animals1015", -1);
    }
//Caculation
    //tamhai
    public static void setTamHai(Context context, int tamhai) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("tamhai", tamhai);
        editor.commit();
    }
    public static int getTamHai(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("tamhai", -1);
    }
    //add6
    public static void setAdd6(Context context, int add6) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("add6", add6);
        editor.commit();
    }
    public static int getAdd6(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("add6", -1);
    }
    //take
    public static void setTake(Context context, int take) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("take", take);
        editor.commit();
    }
    public static int getTake(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("take", -1);
    }
//Delayed Recall
    //lamp
    public static void setLamp(Context context, int lamp) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("lamp", lamp);
        editor.commit();
    }
    public static int getLamp(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("lamp", -1);
    }
    //phone
    public static void setPhone(Context context, int phone) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("phone", phone);
        editor.commit();
    }
    public static int getPhone(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("phone", -1);
    }
    //chair
    public static void setChair(Context context, int chair) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("chair", chair);
        editor.commit();
    }
    public static int getChair(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("chair", -1);
    }
    //car
    public static void setCar(Context context, int car) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("car", car);
        editor.commit();
    }
    public static int getCar(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("car", -1);
    }
    //house
    public static void setHouse(Context context, int house) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("house", house);
        editor.commit();
    }
    public static int getHouse(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("house", -1);
    }
//Judgment
    //whatwould1
    public static void setWhatWould1(Context context, int whatwould1) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("whatwould1", whatwould1);
        editor.commit();
    }
    public static int getWhatWould1(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("whatwould1", -1);
    }
    //whatwould2
    public static void setWhatWould2(Context context, int whatwould2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("whatwould2", whatwould2);
        editor.commit();
    }
    public static int getWhatWould2(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("whatwould2", -1);
    }
//Delayed recall
    //aqua
    public static void setAqua(Context context, int aqua) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("aqua", aqua);
        editor.commit();
    }
    public static int getAqua(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("aqua", -1);
    }
    //awatch
    public static void setAwatch(Context context, int awatch) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("awatch", awatch);
        editor.commit();
    }
    public static int getAwatch(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getInt("awatch", -1);
    }
    //number count
    public static void setNumberCount(Context context, String numbercount) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("numbercount", numbercount);
        editor.commit();
    }
    public static String getNumberCount(Context context) {
        int mode = Activity.MODE_PRIVATE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                QTSConstrains.SHAREPRE_ID, mode);
        return sharedPreferences.getString("numbercount", "null");
    }
}
