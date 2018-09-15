package lk.ijse.quiz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Pid;

    private String Pfullname;
    private String Paddress;
    private String Pemail;
    private String pUserName;
    private String pPassword;
    private int PLevel;


    public Player() {

    }
    public Player(int Pid) {
        this.Pid=Pid;
    }

    public Player(String pfullname, String paddress, String pemail, String pUserName, String pPassword, int PLevel) {
        setPfullname(pfullname);
        setPaddress(paddress);
        setPemail(pemail);
        this.setpUserName(pUserName);
        this.setpPassword(pPassword);
        this.setPLevel(PLevel);
    }

    public Player(int Pid,String pfullname, String paddress, String pemail, String pUserName, String pPassword, int PLevel) {
        this.Pid=Pid;
        setPfullname(pfullname);
        setPaddress(paddress);
        setPemail(pemail);
        this.setpUserName(pUserName);
        this.setpPassword(pPassword);
        this.setPLevel(PLevel);
    }


    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPfullname() {
        return Pfullname;
    }

    public void setPfullname(String pfullname) {
        Pfullname = pfullname;
    }

    public String getPaddress() {
        return Paddress;
    }

    public void setPaddress(String paddress) {
        Paddress = paddress;
    }

    public String getPemail() {
        return Pemail;
    }

    public void setPemail(String pemail) {
        Pemail = pemail;
    }

    public String getpUserName() {
        return pUserName;
    }

    public void setpUserName(String pUserName) {
        this.pUserName = pUserName;
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword;
    }

    public int getPLevel() {
        return PLevel;
    }

    public void setPLevel(int PLevel) {
        this.PLevel = PLevel;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Pid=" + Pid +
                ", Pfullname='" + Pfullname + '\'' +
                ", Paddress='" + Paddress + '\'' +
                ", Pemail='" + Pemail + '\'' +
                ", pUserName='" + pUserName + '\'' +
                ", pPassword='" + pPassword + '\'' +
                ", PLevel=" + PLevel +
                '}';
    }
}
