package thedementiatest.object;

/**
 * Created by MyPC on 23/08/2017.
 */
public class User {
    public int id;
    public String name,person,dateofbirth,levelofeducation,sex,ethnicity,age,count,textcount,work;

    public User() {
    }

    public User(int id, String name, String person, String dateofbirth, String levelofeducation, String sex, String ethnicity, String age, String count, String textcount, String work) {
        this.id = id;
        this.name = name;
        this.person = person;
        this.dateofbirth = dateofbirth;
        this.levelofeducation = levelofeducation;
        this.sex = sex;
        this.ethnicity = ethnicity;
        this.age = age;
        this.count = count;
        this.textcount = textcount;
        this.work = work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getLevelofeducation() {
        return levelofeducation;
    }

    public void setLevelofeducation(String levelofeducation) {
        this.levelofeducation = levelofeducation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTextcount() {
        return textcount;
    }

    public void setTextcount(String textcount) {
        this.textcount = textcount;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
