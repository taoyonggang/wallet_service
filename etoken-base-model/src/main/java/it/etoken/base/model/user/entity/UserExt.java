package it.etoken.base.model.user.entity;

import java.io.Serializable;
import java.util.Date;

public class UserExt implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5376941673075118008L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_ext.id
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_ext.uid
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    private Long uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_ext.eos_account
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    private String eosAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_ext.createdate
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_ext.modifydate
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    private Date modifydate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_ext.id
     *
     * @return the value of user_ext.id
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_ext.id
     *
     * @param id the value for user_ext.id
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_ext.uid
     *
     * @return the value of user_ext.uid
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_ext.uid
     *
     * @param uid the value for user_ext.uid
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_ext.eos_account
     *
     * @return the value of user_ext.eos_account
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public String getEosAccount() {
        return eosAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_ext.eos_account
     *
     * @param eosAccount the value for user_ext.eos_account
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public void setEosAccount(String eosAccount) {
        this.eosAccount = eosAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_ext.createdate
     *
     * @return the value of user_ext.createdate
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_ext.createdate
     *
     * @param createdate the value for user_ext.createdate
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_ext.modifydate
     *
     * @return the value of user_ext.modifydate
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_ext.modifydate
     *
     * @param modifydate the value for user_ext.modifydate
     *
     * @mbg.generated Tue Jun 26 13:51:19 CST 2018
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}