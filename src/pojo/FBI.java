package pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FBI {
    //近战位， 男性，治疗，支援，群攻，减速，控场，生存，防护，重装，辅助，特种，削弱，位移，输出，远程，狙击，先锋，医疗，快速复活
    //近战位
    private String 近战位 = "近战位";
    //男性
    private String 男性 = "男性";
    //治疗
    private String 治疗 = "治疗";
    //支援
    private String 支援 = "支援";
    //群攻
    private String 群攻 = "群攻";
    //减速
    private String 减速 = "减速";
    //控场
    private String 控场 = "控场";
    //生存
    private String 生存 = "生存";
    //支援
    private String 防护 = "防护";
    //防护
    private String 重装 = "重装";
    //重装
    private String 辅助= "辅助";
    //辅助
    private String 特种 = "特种";
    //特种
    private String 削弱 = "削弱";
    //削弱
    private String 位移 = "位移";
    //位移
    private String 输出 = "输出";
    //输出
    private String 远程位 = "远程位";
    //远程
    private String 狙击 = "狙击";
    //狙击
    private String 先锋 = "先锋";
    //先锋
    private String 医疗 = "医疗";
    private String 快速复活 = "快速复活";
    private String 召唤 = "召唤";
    private String 术士 = "术士";
    private String 爆发 = "爆发";
    private String 费用回复 = "费用回复";
    private String 远程 = "远程";
    private String 近战 = "近战";
    private String 近位 = "近位";
    private String 女 = "女";

    public Map FBI() {
        Map<String,Object> map= new HashMap<String,Object>();
        List<String> initFBI = new ArrayList<>();
        //只有两个相加的
        initFBI.add(get近战位()+get男性());
        initFBI.add(get近战位()+get治疗());
        initFBI.add(get近战位()+get支援());
        initFBI.add(get近战位()+get群攻());
        initFBI.add(get近战位()+get减速());
        initFBI.add(get近战位()+get控场());
        map.put("近战位",initFBI);
        List<String> initFBI2 = new ArrayList<>();
        initFBI2.add(get远程位()+get生存());
        initFBI2.add(get远程位()+get支援());
        initFBI2.add(get远程位()+get控场());
        map.put("远程位",initFBI2);
        List<String> initFBI3 = new ArrayList<>();
        initFBI3.add(get输出()+get防护());
        initFBI3.add(get输出()+get重装());
        initFBI3.add(get输出()+get辅助());
        initFBI3.add(get输出()+get特种());
        initFBI3.add(get输出()+get支援());
        initFBI3.add(get输出()+get削弱());
        initFBI3.add(get输出()+get减速());
        initFBI3.add(get输出()+get位移());
        map.put("输出",initFBI3);
        List<String> initFBI4 = new ArrayList<>();
        initFBI4.add(get防护()+get特种());
        initFBI4.add(get防护()+get特种());
        initFBI4.add(get防护()+get男性());
        initFBI4.add(get防护()+get治疗());
        initFBI4.add(get防护()+get位移());
        initFBI4.add(get防护()+get输出());
        initFBI4.add(get防护()+get生存());
        map.put("防护",initFBI4);
        List<String> initFBI5 = new ArrayList<>();
        initFBI5.add(get生存()+get狙击());
        initFBI5.add(get生存()+get群攻());
        initFBI5.add(get生存()+get特种());
        map.put("生存",initFBI5);
        List<String> initFBI6 = new ArrayList<>();
        initFBI6.add(get治疗()+get重装());
        initFBI6.add(get治疗()+get近战());
        initFBI6.add(get治疗()+get防护());
        initFBI6.add(get治疗()+get支援());
        map.put("治疗",initFBI6);
        List<String> initFBI7 = new ArrayList<>();
        //只有一个相加的
        initFBI7.add(get支援());
        //只有两个相加的
        initFBI7.add(get支援()+get先锋());
        initFBI7.add(get支援()+get近位());
        initFBI7.add(get支援()+get医疗());
        initFBI7.add(get支援()+get近战());
        initFBI7.add(get支援()+get远程());
        initFBI7.add(get支援()+get输出());
        map.put("支援",initFBI7);
        List<String> initFBI8 = new ArrayList<>();
        //只有一个相加的
        initFBI8.add(get快速复活());
        //只有两个相加的
        initFBI8.add(get快速复活()+get控场());
        initFBI8.add(get快速复活()+get防护());
        map.put("快速复活",initFBI8);
        //只有两个相加的
        List<String> initFBI9 = new ArrayList<>();
        initFBI9.add(get群攻()+get狙击());
        initFBI9.add(get群攻()+get近位());
        initFBI9.add(get群攻()+get近战());
        initFBI9.add(get群攻()+get生存());
        initFBI9.add(get群攻()+get削弱());
        initFBI9.add(get群攻()+get减速());
        map.put("群攻",initFBI9);
        List<String> initFBI10 = new ArrayList<>();
        //只有一个相加的
        initFBI10.add(get召唤());
        map.put("招呼",initFBI10);
        //只有一个相加的
        List<String> initFBI11 = new ArrayList<>();
        initFBI11.add(get削弱());
        //只有两个相加的
        initFBI11.add(get削弱()+get狙击());
        initFBI11.add(get削弱()+get术士());
        initFBI11.add(get削弱()+get辅助());
        initFBI11.add(get削弱()+get输出());
        initFBI11.add(get削弱()+get群攻());
        map.put("削弱",initFBI11);
        //只有两个相加的
        List<String> initFBI12 = new ArrayList<>();
        initFBI12.add(get减速()+get狙击());
        initFBI12.add(get减速()+get近位());
        initFBI12.add(get减速()+get特种());
        initFBI12.add(get减速()+get近战());
        initFBI12.add(get减速()+get输出());
        initFBI12.add(get减速()+get群攻());
        initFBI12.add(get减速()+get位移());
        map.put("减速",initFBI12);
        //1
        List<String> initFBI13 = new ArrayList<>();
        initFBI13.add(get控场());
        //2
        initFBI13.add(get控场()+get先锋());
        initFBI13.add(get控场()+get特种());
        initFBI13.add(get控场()+get辅助());
        initFBI13.add(get控场()+get近战());
        initFBI13.add(get控场()+get远程());
        initFBI13.add(get控场()+get快速复活());
        map.put("控场",initFBI13);
        //1
        List<String> initFBI14 = new ArrayList<>();
        initFBI14.add(get位移());
        //2
        initFBI14.add(get位移()+get重装());
        initFBI14.add(get位移()+get特种());
        initFBI14.add(get位移()+get输出());
        initFBI14.add(get位移()+get防护());
        initFBI14.add(get位移()+get减速());
        map.put("位移",initFBI14);
        //1
        List<String> initFBI15 = new ArrayList<>();
        initFBI15.add(get爆发());
        map.put("爆发",initFBI15);
        //2
        List<String> initFBI16 = new ArrayList<>();
        initFBI16.add(get狙击()+get群攻());
        initFBI16.add(get狙击()+get削弱());
        initFBI16.add(get狙击()+get减速());
        initFBI16.add(get狙击()+get爆发());
        initFBI16.add(get狙击()+get生存());
        map.put("狙击",initFBI16);
        //2
        List<String> initFBI17 = new ArrayList<>();
        initFBI17.add(get术士()+get削弱());
        map.put("术士",initFBI17);
        //2
        List<String> initFBI18 = new ArrayList<>();
        initFBI18.add(get先锋()+get支援());
        initFBI18.add(get先锋()+get控场());
        map.put("先锋",initFBI18);
        //2
        List<String> initFBI19 = new ArrayList<>();
        initFBI19.add(get近位()+get减速());
        initFBI19.add(get近位()+get支援());
        initFBI19.add(get近位()+get群攻());
        map.put("近卫",initFBI19);
        //2
        List<String> initFBI20 = new ArrayList<>();
        initFBI20.add(get重装()+get治疗());
        initFBI20.add(get重装()+get男性());
        initFBI20.add(get重装()+get位移());
        initFBI20.add(get重装()+get输出());
        initFBI20.add(get重装()+get生存());
        map.put("重装",initFBI20);
        //2
        List<String> initFBI21 = new ArrayList<>();
        initFBI21.add(get医疗()+get支援());
        map.put("医疗",initFBI21);
        //2
        List<String> initFBI22 = new ArrayList<>();
        initFBI22.add(get辅助()+get削弱());
        initFBI22.add(get辅助()+get输出());
        initFBI22.add(get辅助()+get控场());
        map.put("辅助",initFBI22);
        //1
        List<String> initFBI23 = new ArrayList<>();
        initFBI23.add(get特种());
        //2
        initFBI23.add(get特种()+get输出());
        initFBI23.add(get特种()+get防护());
        initFBI23.add(get特种()+get生存());
        initFBI23.add(get特种()+get减速());
        initFBI23.add(get特种()+get控场());
        initFBI23.add(get特种()+get位移());
        map.put("特种",initFBI23);
        //4
        List<String> initFBI24 = new ArrayList<>();
        initFBI24.add(get女()+get狙击()+get远程()+get输出());
        //5
        List<String> initFBI25 = new ArrayList<>();
        initFBI25.add(get男性()+get近位()+get近战()+get输出()+get支援());
        initFBI24.add(get女()+get医疗()+get远程()+get支援()+get治疗());
        initFBI24.add(get女()+get术士()+get远程()+get群攻()+get削弱());
        initFBI24.add(get女()+get重装()+get近战()+get输出()+get防护());
        //6
        initFBI24.add(get女()+get重装()+get近战()+get支援()+get防护()+get治疗());
        initFBI24.add(get女()+get先锋()+get近战()+get费用回复()+get输出());

        map.put("女",initFBI24);
        map.put("男",initFBI25);

        return map;
    }

    public String get近位() {
        return 近位;
    }

    public void set近位(String 近位) {
        this.近位 = 近位;
    }

    public String get近战() {
        return 近战;
    }

    public void set近战(String 近战) {
        this.近战 = 近战;
    }

    public String get远程() {
        return 远程;
    }

    public void set远程(String 远程) {
        this.远程 = 远程;
    }

    public String get近战位() {
        return 近战位;
    }

    public void set近战位(String 近战位) {
        this.近战位 = 近战位;
    }

    public String get男性() {
        return 男性;
    }

    public void set男性(String 男性) {
        this.男性 = 男性;
    }

    public String get治疗() {
        return 治疗;
    }

    public void set治疗(String 治疗) {
        this.治疗 = 治疗;
    }

    public String get支援() {
        return 支援;
    }

    public void set支援(String 支援) {
        this.支援 = 支援;
    }

    public String get群攻() {
        return 群攻;
    }

    public void set群攻(String 群攻) {
        this.群攻 = 群攻;
    }

    public String get减速() {
        return 减速;
    }

    public void set减速(String 减速) {
        this.减速 = 减速;
    }

    public String get控场() {
        return 控场;
    }

    public void set控场(String 控场) {
        this.控场 = 控场;
    }

    public String get生存() {
        return 生存;
    }

    public void set生存(String 生存) {
        this.生存 = 生存;
    }

    public String get防护() {
        return 防护;
    }

    public void set防护(String 防护) {
        this.防护 = 防护;
    }

    public String get重装() {
        return 重装;
    }

    public void set重装(String 重装) {
        this.重装 = 重装;
    }

    public String get辅助() {
        return 辅助;
    }

    public void set辅助(String 辅助) {
        this.辅助 = 辅助;
    }

    public String get特种() {
        return 特种;
    }

    public void set特种(String 特种) {
        this.特种 = 特种;
    }

    public String get削弱() {
        return 削弱;
    }

    public void set削弱(String 削弱) {
        this.削弱 = 削弱;
    }

    public String get位移() {
        return 位移;
    }

    public void set位移(String 位移) {
        this.位移 = 位移;
    }

    public String get输出() {
        return 输出;
    }

    public String get女() {
        return 女;
    }

    public void set女(String 女) {
        this.女 = 女;
    }

    public void set输出(String 输出) {
        this.输出 = 输出;
    }

    public String get远程位() {
        return 远程位;
    }

    public void set远程位(String 远程位) {
        this.远程位 = 远程位;
    }

    public String get狙击() {
        return 狙击;
    }

    public void set狙击(String 狙击) {
        this.狙击 = 狙击;
    }

    public String get先锋() {
        return 先锋;
    }

    public void set先锋(String 先锋) {
        this.先锋 = 先锋;
    }

    public String get医疗() {
        return 医疗;
    }

    public void set医疗(String 医疗) {
        this.医疗 = 医疗;
    }

    public String get快速复活() {
        return 快速复活;
    }

    public void set快速复活(String 快速复活) {
        this.快速复活 = 快速复活;
    }

    public String get召唤() {
        return 召唤;
    }

    public void set召唤(String 召唤) {
        this.召唤 = 召唤;
    }

    public String get术士() {
        return 术士;
    }

    public void set术士(String 术士) {
        this.术士 = 术士;
    }

    public String get爆发() {
        return 爆发;
    }

    public void set爆发(String 爆发) {
        this.爆发 = 爆发;
    }

    public String get费用回复() {
        return 费用回复;
    }

    public void set费用回复(String 费用回复) {
        this.费用回复 = 费用回复;
    }
}
