package lk.ijse.quiz.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Register_PK implements Serializable {

    private int Gid;
    private int Pid;
    private int Rid;

    public Register_PK() {

    }

    public Register_PK(int gid, int pid, int rid) {
        Gid = gid;
        Pid = pid;
        Rid = rid;
    }


}
