package lk.ijse.quiz.dto;

public class PlayerDTO{

    private int Pid;

    private String Pfullname;
    private String Paddress;
    private String Pemail;
    private String PUserName;
    private String PPassword;
    private int PLevel;

    public PlayerDTO() {
    }

    public PlayerDTO(int Pid) {
        this.Pid=Pid;
    }

    public PlayerDTO(int pid, String pfullname, String paddress, String pemail, String PUserName, String PPassword, int PLevel) {
        setPid(pid);
        setPfullname(pfullname);
        setPaddress(paddress);
        setPemail(pemail);
        this.setPUserName(PUserName);
        this.setPPassword(PPassword);
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

    public String getPUserName() {
        return PUserName;
    }

    public void setPUserName(String PUserName) {
        this.PUserName = PUserName;
    }

    public String getPPassword() {
        return PPassword;
    }

    public void setPPassword(String PPassword) {
        this.PPassword = PPassword;
    }

    public int getPLevel() {
        return PLevel;
    }

    public void setPLevel(int PLevel) {
        this.PLevel = PLevel;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "Pid=" + Pid +
                ", Pfullname='" + Pfullname + '\'' +
                ", Paddress='" + Paddress + '\'' +
                ", Pemail='" + Pemail + '\'' +
                ", PUserName='" + PUserName + '\'' +
                ", PPassword='" + PPassword + '\'' +
                ", PLevel=" + PLevel +
                '}';
    }
}
