package org.freefly.dodaily.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SugarMark {
    private Integer id;
    private Boolean status;
    private Integer days;
    private String desc;
    private Date cDate;
    private Date uDate;

    private static String pattern = "yyyy-MM-dd";

    public String getcDate(){
        if(this.cDate == null) {return null;}
        return new SimpleDateFormat(pattern).format(cDate);
    }

    public String getuDate(){
        if(this.uDate == null) {return null;}
        return new SimpleDateFormat(pattern).format(uDate);
    }
}
