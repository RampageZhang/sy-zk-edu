package com.zk.edu.base.AbstractFactory;

public enum RightsEnum {
    COUPON(getCoupon()),
    INTEGRAL(getIntegral()),
    PARKINGTICKET(getParkingTicket()),;
    private Rights rights;
    RightsEnum(Rights rights) {
        this.rights =rights;
    }
    public Rights getRights() {
        return rights;
    }
    public void setRights(Rights rights) {
        this.rights = rights;
    }

    private static volatile Coupon coupon = null;  //保证 instance 在所有线程中同步

    private static volatile Integral integral = null;  //保证 instance 在所有线程中同步

    private static volatile ParkingTicket parkingTicket = null;  //保证 instance 在所有线程中同步
    private static synchronized Coupon getCoupon(){
            if(coupon == null){
                coupon = new Coupon();
            }
            return coupon;
    }
    private static synchronized Integral getIntegral(){
        if(integral == null){
            integral = new Integral();
        }
        return integral;

    }
    private static synchronized ParkingTicket getParkingTicket(){
        if(parkingTicket == null){
            parkingTicket = new ParkingTicket();
        }
        return parkingTicket;
    }

}