package it.etoken.base.model.eosblock.entity;

import java.io.Serializable;

public class Stakes implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4102389430887471997L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stakes.account
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stakes.cpu
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Double cpu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stakes.net
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    private Double net;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stakes.account
     *
     * @return the value of stakes.account
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stakes.account
     *
     * @param account the value for stakes.account
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stakes.cpu
     *
     * @return the value of stakes.cpu
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Double getCpu() {
        return cpu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stakes.cpu
     *
     * @param cpu the value for stakes.cpu
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stakes.net
     *
     * @return the value of stakes.net
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public Double getNet() {
        return net;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stakes.net
     *
     * @param net the value for stakes.net
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public void setNet(Double net) {
        this.net = net;
    }
}