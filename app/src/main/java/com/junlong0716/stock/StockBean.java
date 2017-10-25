package com.junlong0716.stock;

import java.util.List;

/**
 * @Author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午6:59 2017/10/24
 * @Modified By:
 */
public class StockBean {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"data":{"buyFive":"31000","buyFivePri":"8.790","buyFour":"87200","buyFourPri":"8.800","buyOne":"12600","buyOnePri":"8.830","buyThree":"13800","buyThreePri":"8.810","buyTwo":"24700","buyTwoPri":"8.820","competitivePri":"8.830","date":"2017-10-24","gid":"sz002375","increPer":"-0.34","increase":"-0.03","name":"亚厦股份","nowPri":"8.830","reservePri":"8.840","sellFive":"32700","sellFivePri":"8.880","sellFour":"20600","sellFourPri":"8.870","sellOne":"34200","sellOnePri":"8.840","sellThree":"10200","sellThreePri":"8.860","sellTwo":"13200","sellTwoPri":"8.850","time":"15:25:03","todayMax":"8.910","todayMin":"8.760","todayStartPri":"8.860","traAmount":"25556718.000","traNumber":"28925","yestodEndPri":"8.860"},"dapandata":{"dot":"8.83","name":"亚厦股份","nowPic":"-0.03","rate":"-0.34","traAmount":"2555","traNumber":"28925"},"gopicture":{"minurl":"http://image.sinajs.cn/newchart/min/n/sz002375.gif","dayurl":"http://image.sinajs.cn/newchart/daily/n/sz002375.gif","weekurl":"http://image.sinajs.cn/newchart/weekly/n/sz002375.gif","monthurl":"http://image.sinajs.cn/newchart/monthly/n/sz002375.gif"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : {"buyFive":"31000","buyFivePri":"8.790","buyFour":"87200","buyFourPri":"8.800","buyOne":"12600","buyOnePri":"8.830","buyThree":"13800","buyThreePri":"8.810","buyTwo":"24700","buyTwoPri":"8.820","competitivePri":"8.830","date":"2017-10-24","gid":"sz002375","increPer":"-0.34","increase":"-0.03","name":"亚厦股份","nowPri":"8.830","reservePri":"8.840","sellFive":"32700","sellFivePri":"8.880","sellFour":"20600","sellFourPri":"8.870","sellOne":"34200","sellOnePri":"8.840","sellThree":"10200","sellThreePri":"8.860","sellTwo":"13200","sellTwoPri":"8.850","time":"15:25:03","todayMax":"8.910","todayMin":"8.760","todayStartPri":"8.860","traAmount":"25556718.000","traNumber":"28925","yestodEndPri":"8.860"}
         * dapandata : {"dot":"8.83","name":"亚厦股份","nowPic":"-0.03","rate":"-0.34","traAmount":"2555","traNumber":"28925"}
         * gopicture : {"minurl":"http://image.sinajs.cn/newchart/min/n/sz002375.gif","dayurl":"http://image.sinajs.cn/newchart/daily/n/sz002375.gif","weekurl":"http://image.sinajs.cn/newchart/weekly/n/sz002375.gif","monthurl":"http://image.sinajs.cn/newchart/monthly/n/sz002375.gif"}
         */

        private DataBean data;
        private DapandataBean dapandata;
        private GopictureBean gopicture;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public DapandataBean getDapandata() {
            return dapandata;
        }

        public void setDapandata(DapandataBean dapandata) {
            this.dapandata = dapandata;
        }

        public GopictureBean getGopicture() {
            return gopicture;
        }

        public void setGopicture(GopictureBean gopicture) {
            this.gopicture = gopicture;
        }

        public static class DataBean {
            /**
             * buyFive : 31000
             * buyFivePri : 8.790
             * buyFour : 87200
             * buyFourPri : 8.800
             * buyOne : 12600
             * buyOnePri : 8.830
             * buyThree : 13800
             * buyThreePri : 8.810
             * buyTwo : 24700
             * buyTwoPri : 8.820
             * competitivePri : 8.830
             * date : 2017-10-24
             * gid : sz002375
             * increPer : -0.34
             * increase : -0.03
             * name : 亚厦股份
             * nowPri : 8.830
             * reservePri : 8.840
             * sellFive : 32700
             * sellFivePri : 8.880
             * sellFour : 20600
             * sellFourPri : 8.870
             * sellOne : 34200
             * sellOnePri : 8.840
             * sellThree : 10200
             * sellThreePri : 8.860
             * sellTwo : 13200
             * sellTwoPri : 8.850
             * time : 15:25:03
             * todayMax : 8.910
             * todayMin : 8.760
             * todayStartPri : 8.860
             * traAmount : 25556718.000
             * traNumber : 28925
             * yestodEndPri : 8.860
             */

            private String buyFive;
            private String buyFivePri;
            private String buyFour;
            private String buyFourPri;
            private String buyOne;
            private String buyOnePri;
            private String buyThree;
            private String buyThreePri;
            private String buyTwo;
            private String buyTwoPri;
            private String competitivePri;
            private String date;
            private String gid;
            private String increPer;
            private String increase;
            private String name;
            private String nowPri;
            private String reservePri;
            private String sellFive;
            private String sellFivePri;
            private String sellFour;
            private String sellFourPri;
            private String sellOne;
            private String sellOnePri;
            private String sellThree;
            private String sellThreePri;
            private String sellTwo;
            private String sellTwoPri;
            private String time;
            private String todayMax;
            private String todayMin;
            private String todayStartPri;
            private String traAmount;
            private String traNumber;
            private String yestodEndPri;

            public String getBuyFive() {
                return buyFive;
            }

            public void setBuyFive(String buyFive) {
                this.buyFive = buyFive;
            }

            public String getBuyFivePri() {
                return buyFivePri;
            }

            public void setBuyFivePri(String buyFivePri) {
                this.buyFivePri = buyFivePri;
            }

            public String getBuyFour() {
                return buyFour;
            }

            public void setBuyFour(String buyFour) {
                this.buyFour = buyFour;
            }

            public String getBuyFourPri() {
                return buyFourPri;
            }

            public void setBuyFourPri(String buyFourPri) {
                this.buyFourPri = buyFourPri;
            }

            public String getBuyOne() {
                return buyOne;
            }

            public void setBuyOne(String buyOne) {
                this.buyOne = buyOne;
            }

            public String getBuyOnePri() {
                return buyOnePri;
            }

            public void setBuyOnePri(String buyOnePri) {
                this.buyOnePri = buyOnePri;
            }

            public String getBuyThree() {
                return buyThree;
            }

            public void setBuyThree(String buyThree) {
                this.buyThree = buyThree;
            }

            public String getBuyThreePri() {
                return buyThreePri;
            }

            public void setBuyThreePri(String buyThreePri) {
                this.buyThreePri = buyThreePri;
            }

            public String getBuyTwo() {
                return buyTwo;
            }

            public void setBuyTwo(String buyTwo) {
                this.buyTwo = buyTwo;
            }

            public String getBuyTwoPri() {
                return buyTwoPri;
            }

            public void setBuyTwoPri(String buyTwoPri) {
                this.buyTwoPri = buyTwoPri;
            }

            public String getCompetitivePri() {
                return competitivePri;
            }

            public void setCompetitivePri(String competitivePri) {
                this.competitivePri = competitivePri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getGid() {
                return gid;
            }

            public void setGid(String gid) {
                this.gid = gid;
            }

            public String getIncrePer() {
                return increPer;
            }

            public void setIncrePer(String increPer) {
                this.increPer = increPer;
            }

            public String getIncrease() {
                return increase;
            }

            public void setIncrease(String increase) {
                this.increase = increase;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNowPri() {
                return nowPri;
            }

            public void setNowPri(String nowPri) {
                this.nowPri = nowPri;
            }

            public String getReservePri() {
                return reservePri;
            }

            public void setReservePri(String reservePri) {
                this.reservePri = reservePri;
            }

            public String getSellFive() {
                return sellFive;
            }

            public void setSellFive(String sellFive) {
                this.sellFive = sellFive;
            }

            public String getSellFivePri() {
                return sellFivePri;
            }

            public void setSellFivePri(String sellFivePri) {
                this.sellFivePri = sellFivePri;
            }

            public String getSellFour() {
                return sellFour;
            }

            public void setSellFour(String sellFour) {
                this.sellFour = sellFour;
            }

            public String getSellFourPri() {
                return sellFourPri;
            }

            public void setSellFourPri(String sellFourPri) {
                this.sellFourPri = sellFourPri;
            }

            public String getSellOne() {
                return sellOne;
            }

            public void setSellOne(String sellOne) {
                this.sellOne = sellOne;
            }

            public String getSellOnePri() {
                return sellOnePri;
            }

            public void setSellOnePri(String sellOnePri) {
                this.sellOnePri = sellOnePri;
            }

            public String getSellThree() {
                return sellThree;
            }

            public void setSellThree(String sellThree) {
                this.sellThree = sellThree;
            }

            public String getSellThreePri() {
                return sellThreePri;
            }

            public void setSellThreePri(String sellThreePri) {
                this.sellThreePri = sellThreePri;
            }

            public String getSellTwo() {
                return sellTwo;
            }

            public void setSellTwo(String sellTwo) {
                this.sellTwo = sellTwo;
            }

            public String getSellTwoPri() {
                return sellTwoPri;
            }

            public void setSellTwoPri(String sellTwoPri) {
                this.sellTwoPri = sellTwoPri;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTodayMax() {
                return todayMax;
            }

            public void setTodayMax(String todayMax) {
                this.todayMax = todayMax;
            }

            public String getTodayMin() {
                return todayMin;
            }

            public void setTodayMin(String todayMin) {
                this.todayMin = todayMin;
            }

            public String getTodayStartPri() {
                return todayStartPri;
            }

            public void setTodayStartPri(String todayStartPri) {
                this.todayStartPri = todayStartPri;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getTraNumber() {
                return traNumber;
            }

            public void setTraNumber(String traNumber) {
                this.traNumber = traNumber;
            }

            public String getYestodEndPri() {
                return yestodEndPri;
            }

            public void setYestodEndPri(String yestodEndPri) {
                this.yestodEndPri = yestodEndPri;
            }
        }

        public static class DapandataBean {
            /**
             * dot : 8.83
             * name : 亚厦股份
             * nowPic : -0.03
             * rate : -0.34
             * traAmount : 2555
             * traNumber : 28925
             */

            private String dot;
            private String name;
            private String nowPic;
            private String rate;
            private String traAmount;
            private String traNumber;

            public String getDot() {
                return dot;
            }

            public void setDot(String dot) {
                this.dot = dot;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNowPic() {
                return nowPic;
            }

            public void setNowPic(String nowPic) {
                this.nowPic = nowPic;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getTraNumber() {
                return traNumber;
            }

            public void setTraNumber(String traNumber) {
                this.traNumber = traNumber;
            }
        }

        public static class GopictureBean {
            /**
             * minurl : http://image.sinajs.cn/newchart/min/n/sz002375.gif
             * dayurl : http://image.sinajs.cn/newchart/daily/n/sz002375.gif
             * weekurl : http://image.sinajs.cn/newchart/weekly/n/sz002375.gif
             * monthurl : http://image.sinajs.cn/newchart/monthly/n/sz002375.gif
             */

            private String minurl;
            private String dayurl;
            private String weekurl;
            private String monthurl;

            public String getMinurl() {
                return minurl;
            }

            public void setMinurl(String minurl) {
                this.minurl = minurl;
            }

            public String getDayurl() {
                return dayurl;
            }

            public void setDayurl(String dayurl) {
                this.dayurl = dayurl;
            }

            public String getWeekurl() {
                return weekurl;
            }

            public void setWeekurl(String weekurl) {
                this.weekurl = weekurl;
            }

            public String getMonthurl() {
                return monthurl;
            }

            public void setMonthurl(String monthurl) {
                this.monthurl = monthurl;
            }
        }
    }
}
