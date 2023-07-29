package org.freefly.dodaily.entity;

import lombok.Data;

import java.util.Date;

/**
 * search model for paid info
 *
 * @author freefly365
 * @date 2523-07-29
 * */
@Data
public class PaidInfoSea {
    private int userId; // filled by the service
    private PaidCategory cate;
    private String comment;
    private int exp1; // the min of expense
    private int exp2; // the max of expense
    private Date t1; // the start of create time
    private Date t2; // the end of create time
}