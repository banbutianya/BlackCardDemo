package com.bignerdranch.android.blackcarddemo.bean;

import java.util.List;

/**
 * Created by acer-1 on 2017/9/26.
 */

public class BkhomeResponse {

    /**
     * result : 1
     * msg :
     * data : {"head":"http://s.qing-hei.com/Public/Uploads/20170603/s_593224d94c602.jpeg","cardid":"001122","level":"精英会籍","time":"2017-04-19","name":"李倩","nickname":"小丸子","sex":"0","asset":0,"cardmoney":"0.00","frozenmonye":"0.00","moneytips":"余额可直接支付青年黑卡任意产品，若您有预付或担保等需求，可直接在此进行充值，余额可任意提现。","cert_pic":"","certification":"","introinfo":"可爱萌妹子","pushmsg":[{"push_id":"4","push_title":"【New Life】云南普洱百年古茶树认领","push_title2":"挂牌证书/价值6000元以上7块茶饼","push_url":"http://www.qing-hei.com/mobile.php/welfare/info/id/112/type/1/","push_pic":"http://s.qing-hei.com/Public/Uploads/5937ce1c98ba2.jpg"}],"privilegenum":28,"privilege":[{"tq_id":"1","tq_name":"顶级管家","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-01.png","tq_content":"省时省心，100%权益保障，顶级管家团队为您妥善打理生活。只需发条消息管家便可安排好一切，全方位满足会员需求。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/1.jpg","tq_px":"0","tq_px1":"0","tq_px2":"0","tq_px3":"0","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"2","tq_name":"机酒特权","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-02.png","tq_content":"全球酒店集团与票务深度合作，酒店机票底价，承诺预订贵了双倍差价赔付。专利比价系统软件著作权与经验丰富的管家团队，保证会员利益最大化。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/2.jpg","tq_px":"1","tq_px1":"1","tq_px2":"1","tq_px3":"1","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"5","tq_name":"米其林餐厅","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-05.png","tq_content":"目前米其林餐厅普遍采取预约制，非预约几乎很难订到用餐席位，并且部分餐厅不接受个人预订，青年黑卡与全球星级米其林餐厅长期保持良好合作，为会员提供正式的官方预约代订服务。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/5.jpg","tq_px":"2","tq_px1":"2","tq_px2":"8","tq_px3":"9","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"21","tq_name":"飞机试驾","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-25.png","tq_content":"为持卡人提供小型私人飞机试驾资格，目前开通城市包括北京、西安、杭州、曼谷，试驾价格1600元起，无需飞行驾照与经验，自驾冲上云霄，体验从2000米高空俯瞰世界的快感，并颁发飞行证书。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/21.jpg","tq_px":"5","tq_px1":"3","tq_px2":"3","tq_px3":"5","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"9","tq_name":"私人游艇","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-09.png","tq_content":"出海在游艇办一场Party的价格可能比在KTV更优惠，经历过一次出海之后，你才会体验真正海上度假的美妙，让您一次\u201c玩海中毒\u201d，聚会与派对，在海上抛下压力烦恼，畅享出海的乐趣和航海的快感。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/9.jpg","tq_px":"4","tq_px1":"4","tq_px2":"4","tq_px3":"10","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"13","tq_name":"专车出行","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-13.png","tq_content":"黑卡管家为您提供全球范围主要城市机场接送机预约及国内主要城市专车全天24小时服务，商务正装司机代开车门、驾龄保证、安全出行。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/13.jpg","tq_px":"18","tq_px1":"5","tq_px2":"5","tq_px3":"7","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"8","tq_name":"鲜花蛋糕","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-08.png","tq_content":"免费为会员及会员亲友上门配送鲜花蛋糕（偏远地区需加收10-50元配送费），蛋糕配送品牌包括元祖、好利来等，覆盖中国大陆各城市。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/8.jpg","tq_px":"16","tq_px1":"6","tq_px2":"6","tq_px3":"6","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"22","tq_name":"跳伞体验","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-24.png","tq_content":"全程澳洲资深教练护航，全新国际一线装备安全保障，千米高空自由落体自由飞行，体验肾上腺素的刺激飙升极致快感，专业高清摄像全程记录勇敢。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/22.jpg","tq_px":"14","tq_px1":"7","tq_px2":"7","tq_px3":"8","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"10","tq_name":"黑卡签单","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-10.png","tq_content":"提供先消费、后付款的透支签单特权，信用评估及审核通过后最高可享受十万元额度。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/10.jpg","tq_px":"3","tq_px1":"8","tq_px2":"19","tq_px3":"26","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"4","tq_name":"海外好物专享","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-04.png","tq_content":"由青黑专业产品体验师搜罗全球好物，私属高级定制系列、轻奢品牌联名，黑科技好物，同时为会员提供精英生活内参讲解，包括红酒常识、穿衣搭配等，为每位会员升级品质生活。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/4.jpg","tq_px":"7","tq_px1":"9","tq_px2":"9","tq_px3":"18","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"19","tq_name":"帆船出海","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-19.png","tq_content":"帆船出海是追逐阳光与海浪的绝佳方式，驾一叶扁舟迎着清新的空气徜徉在浪漫浩瀚的大海上，还能获得玩转风帆的乐趣！帆船伴随海浪驶离港口，海风从两帆之间穿过，随之而来的是风一般的速度，船头激起白色的浪花。支持按人计费或包船出海，具体请咨询管家。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/19.jpg","tq_px":"11","tq_px1":"10","tq_px2":"10","tq_px3":"3","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"20","tq_name":"马术俱乐部","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-20.png","tq_content":"资深的马术教练提供系统的马术培训课程，提供标准专业沙场地及完善的配套设施，精良的专业防护装备保护骑乘者安全。开通城市根据季节变化原因、城市政策等变动较多，需咨询管家确定。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/20.jpg","tq_px":"13","tq_px1":"11","tq_px2":"11","tq_px3":"23","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"28","tq_name":"特权线路","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-28.png","tq_content":"工作与生活同等重要，对于整日里忙于工作的精英们来说，旅行能全方位放松身心，远离纷杂。青年黑卡整合国内外数万条旅行路线，由资深旅行体验师亲身体验和筛选，推出涵盖全球范围、有特色适合年轻精英的特权线路，包含自由行与跟团游，不再把时间浪费在攻略剖析与对比线路上。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/28.jpg","tq_px":"8","tq_px1":"12","tq_px2":"12","tq_px3":"17","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"16","tq_name":"定制旅行","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-16.png","tq_content":"根据持卡人的个性化需求，帮助制定专属行程与旅行计划。会员的任何需求，青黑都会尽可能调动当地所有资源给予满足，冰岛冰火之路的自驾穿越、未被侵占的隐秘私人海岛、徒步于奶蓝冰冠的格陵兰之上、去丹麦寻找安徒生童话...","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/16.jpg","tq_px":"6","tq_px1":"13","tq_px2":"13","tq_px3":"16","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"27","tq_name":"机场贵宾厅","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-27.png","tq_content":"全球范围内800家机场贵宾休息室特价预约服务，任意仓位皆可享受，帮您远离嘈杂的公共区域、赶走旅途疲惫，随订随用享受尊贵体验，长期贵宾休息室特价优惠活动，不定期贵宾休息室免费活动。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/27.jpg","tq_px":"9","tq_px1":"14","tq_px2":"14","tq_px3":"15","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"26","tq_name":"海外华人导游","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-26.png","tq_content":"黑卡管家为会员提供覆盖全球范围内60多个国家、360个城市境外华人导游定制服务，在线挑选导游，管家为您提供最专业的建议和定制方案，旅行全程华人陪同中文交流，带您深入到当地的风土人情，助您体验旅行真正的意义。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/26.jpg","tq_px":"19","tq_px1":"15","tq_px2":"15","tq_px3":"14","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"12","tq_name":"豪华游轮","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-12.png","tq_content":"支持国内所有游轮线路优惠预订，最潮的旅行新体验，无需为住宿交通烦恼，玩转日光甲板，享受完美假期。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/12.jpg","tq_px":"15","tq_px1":"16","tq_px2":"16","tq_px3":"12","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"17","tq_name":"极速签证","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-17.png","tq_content":"一站式签证办理服务，极速出签，黑卡管家为会员提供全球范围专业的签证咨询、免费快速代办服务，签证材料在线预审，答疑解惑，签证进度实时跟踪、资料安全保密助您无忧轻松出国游。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/17.jpg","tq_px":"17","tq_px1":"17","tq_px2":"17","tq_px3":"21","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"14","tq_name":"高尔夫顾问","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-14.png","tq_content":"专属优惠的价格为热爱高尔夫运动的会员倾情提供全亚洲球场预订。打球、住宿、交通一站式定制，让那些难以割舍高尔夫的会员，尽情享受这项运动带来的健康与魅力享受。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/14.jpg","tq_px":"12","tq_px1":"19","tq_px2":"18","tq_px3":"24","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"15","tq_name":"基因检测","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-15.png","tq_content":"为会员挑选最适合中国家庭的基因检测服务，源于世界级的基因组学研究成果，为您探寻生命的根本奥秘，检测内容包括：美肤基因检测、乳腺癌易感基因检测、烟酒损伤易感基因检测套餐等。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/15.jpg","tq_px":"20","tq_px1":"20","tq_px2":"20","tq_px3":"22","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"24","tq_name":"道路救援","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-21.png","tq_content":"为持卡人提供全国紧急汽车道路救援服务，包括：拖车、油电、速修等项目。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/24.jpg","tq_px":"21","tq_px1":"21","tq_px2":"21","tq_px3":"20","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"30","tq_name":"专属福利","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-29.png","tq_content":"Iphone7首发95折、五星酒店试睡、免费贵宾厅活动、澳洲华裔小姐酒会邀请等\u2026不定期为黑卡会员提供俱乐部专属福利活动","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/29.jpg","tq_px":"22","tq_px1":"22","tq_px2":"22","tq_px3":"25","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"7","tq_name":"亲友资格","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-07.png","tq_content":"荣誉及云逸会籍持卡人可添加三位亲友名额，同时享受青年黑卡持卡人权益）","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/7.jpg","tq_px":"-1","tq_px1":"23","tq_px2":"2","tq_px3":"27","tq_type":"0","tq_web":"","tq_have":"2","tq_biaoshi":"荣誉/云逸专属","is_have":"2","level_tips":"很抱歉，该特权为荣誉及云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"23","tq_name":"紧急SOS","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-23.png","tq_content":"云逸专属：如果您遇到突发事件、到店无房等紧急情况时，可直接点击紧急按钮，专人管家极速接入并致电会员，享有优先服务特权。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/23.jpg","tq_px":"-4","tq_px1":"24","tq_px2":"23","tq_px3":"13","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"11","tq_name":"海外医疗","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-11.png","tq_content":"云逸专属：工作繁忙之余，自身的健康状况也应该是高度关注的问题，青年黑卡提供海外医疗等健康解决方案，为每一位持卡人的身体管理保驾护航。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/11.jpg","tq_px":"-2","tq_px1":"25","tq_px2":"24","tq_px3":"19","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"3","tq_name":"社交酒会","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-03.png","tq_content":"云逸专属：不定期为持卡人提供名人明星社交酒会邀请资格，如美国总统国会山就职演讲邀请、华裔小姐大赛观礼、国内知名电影节邀请等。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/3.jpg","tq_px":"-5","tq_px1":"26","tq_px2":"25","tq_px3":"11","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"29","tq_name":"法律顾问","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-22.png","tq_content":"云逸专属: 贴身法律顾问，需要法律咨询、法律维权和民事纠纷诉讼等情况时可联系黑卡管家，为您提供最专业的法律援助。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/30.jpg","tq_px":"-3","tq_px1":"27","tq_px2":"26","tq_px3":"4","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"6","tq_name":"私人飞机","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-06.png","tq_content":"云逸专属：可选择机型包括：莱格赛650、莱格赛500、比亚乔P180、挑战者850等，同时可选择涵盖在内的首都机场CIP贵宾礼遇，独有的拼机服务，让会员有机会享受更低的价格乘坐私人飞机出行。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/6.jpg","tq_px":"-6","tq_px1":"28","tq_px2":"27","tq_px3":"2","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"}]}
     */

    private int result;
    private String msg;
    private DataBean data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * head : http://s.qing-hei.com/Public/Uploads/20170603/s_593224d94c602.jpeg
         * cardid : 001122
         * level : 精英会籍
         * time : 2017-04-19
         * name : 李倩
         * nickname : 小丸子
         * sex : 0
         * asset : 0
         * cardmoney : 0.00
         * frozenmonye : 0.00
         * moneytips : 余额可直接支付青年黑卡任意产品，若您有预付或担保等需求，可直接在此进行充值，余额可任意提现。
         * cert_pic :
         * certification :
         * introinfo : 可爱萌妹子
         * pushmsg : [{"push_id":"4","push_title":"【New Life】云南普洱百年古茶树认领","push_title2":"挂牌证书/价值6000元以上7块茶饼","push_url":"http://www.qing-hei.com/mobile.php/welfare/info/id/112/type/1/","push_pic":"http://s.qing-hei.com/Public/Uploads/5937ce1c98ba2.jpg"}]
         * privilegenum : 28
         * privilege : [{"tq_id":"1","tq_name":"顶级管家","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-01.png","tq_content":"省时省心，100%权益保障，顶级管家团队为您妥善打理生活。只需发条消息管家便可安排好一切，全方位满足会员需求。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/1.jpg","tq_px":"0","tq_px1":"0","tq_px2":"0","tq_px3":"0","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"2","tq_name":"机酒特权","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-02.png","tq_content":"全球酒店集团与票务深度合作，酒店机票底价，承诺预订贵了双倍差价赔付。专利比价系统软件著作权与经验丰富的管家团队，保证会员利益最大化。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/2.jpg","tq_px":"1","tq_px1":"1","tq_px2":"1","tq_px3":"1","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"5","tq_name":"米其林餐厅","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-05.png","tq_content":"目前米其林餐厅普遍采取预约制，非预约几乎很难订到用餐席位，并且部分餐厅不接受个人预订，青年黑卡与全球星级米其林餐厅长期保持良好合作，为会员提供正式的官方预约代订服务。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/5.jpg","tq_px":"2","tq_px1":"2","tq_px2":"8","tq_px3":"9","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"21","tq_name":"飞机试驾","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-25.png","tq_content":"为持卡人提供小型私人飞机试驾资格，目前开通城市包括北京、西安、杭州、曼谷，试驾价格1600元起，无需飞行驾照与经验，自驾冲上云霄，体验从2000米高空俯瞰世界的快感，并颁发飞行证书。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/21.jpg","tq_px":"5","tq_px1":"3","tq_px2":"3","tq_px3":"5","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"9","tq_name":"私人游艇","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-09.png","tq_content":"出海在游艇办一场Party的价格可能比在KTV更优惠，经历过一次出海之后，你才会体验真正海上度假的美妙，让您一次\u201c玩海中毒\u201d，聚会与派对，在海上抛下压力烦恼，畅享出海的乐趣和航海的快感。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/9.jpg","tq_px":"4","tq_px1":"4","tq_px2":"4","tq_px3":"10","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"13","tq_name":"专车出行","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-13.png","tq_content":"黑卡管家为您提供全球范围主要城市机场接送机预约及国内主要城市专车全天24小时服务，商务正装司机代开车门、驾龄保证、安全出行。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/13.jpg","tq_px":"18","tq_px1":"5","tq_px2":"5","tq_px3":"7","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"8","tq_name":"鲜花蛋糕","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-08.png","tq_content":"免费为会员及会员亲友上门配送鲜花蛋糕（偏远地区需加收10-50元配送费），蛋糕配送品牌包括元祖、好利来等，覆盖中国大陆各城市。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/8.jpg","tq_px":"16","tq_px1":"6","tq_px2":"6","tq_px3":"6","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"22","tq_name":"跳伞体验","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-24.png","tq_content":"全程澳洲资深教练护航，全新国际一线装备安全保障，千米高空自由落体自由飞行，体验肾上腺素的刺激飙升极致快感，专业高清摄像全程记录勇敢。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/22.jpg","tq_px":"14","tq_px1":"7","tq_px2":"7","tq_px3":"8","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"10","tq_name":"黑卡签单","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-10.png","tq_content":"提供先消费、后付款的透支签单特权，信用评估及审核通过后最高可享受十万元额度。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/10.jpg","tq_px":"3","tq_px1":"8","tq_px2":"19","tq_px3":"26","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"4","tq_name":"海外好物专享","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-04.png","tq_content":"由青黑专业产品体验师搜罗全球好物，私属高级定制系列、轻奢品牌联名，黑科技好物，同时为会员提供精英生活内参讲解，包括红酒常识、穿衣搭配等，为每位会员升级品质生活。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/4.jpg","tq_px":"7","tq_px1":"9","tq_px2":"9","tq_px3":"18","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"19","tq_name":"帆船出海","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-19.png","tq_content":"帆船出海是追逐阳光与海浪的绝佳方式，驾一叶扁舟迎着清新的空气徜徉在浪漫浩瀚的大海上，还能获得玩转风帆的乐趣！帆船伴随海浪驶离港口，海风从两帆之间穿过，随之而来的是风一般的速度，船头激起白色的浪花。支持按人计费或包船出海，具体请咨询管家。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/19.jpg","tq_px":"11","tq_px1":"10","tq_px2":"10","tq_px3":"3","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"20","tq_name":"马术俱乐部","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-20.png","tq_content":"资深的马术教练提供系统的马术培训课程，提供标准专业沙场地及完善的配套设施，精良的专业防护装备保护骑乘者安全。开通城市根据季节变化原因、城市政策等变动较多，需咨询管家确定。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/20.jpg","tq_px":"13","tq_px1":"11","tq_px2":"11","tq_px3":"23","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"28","tq_name":"特权线路","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-28.png","tq_content":"工作与生活同等重要，对于整日里忙于工作的精英们来说，旅行能全方位放松身心，远离纷杂。青年黑卡整合国内外数万条旅行路线，由资深旅行体验师亲身体验和筛选，推出涵盖全球范围、有特色适合年轻精英的特权线路，包含自由行与跟团游，不再把时间浪费在攻略剖析与对比线路上。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/28.jpg","tq_px":"8","tq_px1":"12","tq_px2":"12","tq_px3":"17","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"16","tq_name":"定制旅行","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-16.png","tq_content":"根据持卡人的个性化需求，帮助制定专属行程与旅行计划。会员的任何需求，青黑都会尽可能调动当地所有资源给予满足，冰岛冰火之路的自驾穿越、未被侵占的隐秘私人海岛、徒步于奶蓝冰冠的格陵兰之上、去丹麦寻找安徒生童话...","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/16.jpg","tq_px":"6","tq_px1":"13","tq_px2":"13","tq_px3":"16","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"27","tq_name":"机场贵宾厅","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-27.png","tq_content":"全球范围内800家机场贵宾休息室特价预约服务，任意仓位皆可享受，帮您远离嘈杂的公共区域、赶走旅途疲惫，随订随用享受尊贵体验，长期贵宾休息室特价优惠活动，不定期贵宾休息室免费活动。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/27.jpg","tq_px":"9","tq_px1":"14","tq_px2":"14","tq_px3":"15","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"26","tq_name":"海外华人导游","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-26.png","tq_content":"黑卡管家为会员提供覆盖全球范围内60多个国家、360个城市境外华人导游定制服务，在线挑选导游，管家为您提供最专业的建议和定制方案，旅行全程华人陪同中文交流，带您深入到当地的风土人情，助您体验旅行真正的意义。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/26.jpg","tq_px":"19","tq_px1":"15","tq_px2":"15","tq_px3":"14","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"12","tq_name":"豪华游轮","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-12.png","tq_content":"支持国内所有游轮线路优惠预订，最潮的旅行新体验，无需为住宿交通烦恼，玩转日光甲板，享受完美假期。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/12.jpg","tq_px":"15","tq_px1":"16","tq_px2":"16","tq_px3":"12","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"17","tq_name":"极速签证","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-17.png","tq_content":"一站式签证办理服务，极速出签，黑卡管家为会员提供全球范围专业的签证咨询、免费快速代办服务，签证材料在线预审，答疑解惑，签证进度实时跟踪、资料安全保密助您无忧轻松出国游。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/17.jpg","tq_px":"17","tq_px1":"17","tq_px2":"17","tq_px3":"21","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"14","tq_name":"高尔夫顾问","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-14.png","tq_content":"专属优惠的价格为热爱高尔夫运动的会员倾情提供全亚洲球场预订。打球、住宿、交通一站式定制，让那些难以割舍高尔夫的会员，尽情享受这项运动带来的健康与魅力享受。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/14.jpg","tq_px":"12","tq_px1":"19","tq_px2":"18","tq_px3":"24","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"15","tq_name":"基因检测","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-15.png","tq_content":"为会员挑选最适合中国家庭的基因检测服务，源于世界级的基因组学研究成果，为您探寻生命的根本奥秘，检测内容包括：美肤基因检测、乳腺癌易感基因检测、烟酒损伤易感基因检测套餐等。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/15.jpg","tq_px":"20","tq_px1":"20","tq_px2":"20","tq_px3":"22","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"24","tq_name":"道路救援","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-21.png","tq_content":"为持卡人提供全国紧急汽车道路救援服务，包括：拖车、油电、速修等项目。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/24.jpg","tq_px":"21","tq_px1":"21","tq_px2":"21","tq_px3":"20","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"30","tq_name":"专属福利","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-29.png","tq_content":"Iphone7首发95折、五星酒店试睡、免费贵宾厅活动、澳洲华裔小姐酒会邀请等\u2026不定期为黑卡会员提供俱乐部专属福利活动","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/29.jpg","tq_px":"22","tq_px1":"22","tq_px2":"22","tq_px3":"25","tq_type":"0","tq_web":"","tq_have":"1","tq_biaoshi":"","is_have":"1","level_tips":""},{"tq_id":"7","tq_name":"亲友资格","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-07.png","tq_content":"荣誉及云逸会籍持卡人可添加三位亲友名额，同时享受青年黑卡持卡人权益）","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/7.jpg","tq_px":"-1","tq_px1":"23","tq_px2":"2","tq_px3":"27","tq_type":"0","tq_web":"","tq_have":"2","tq_biaoshi":"荣誉/云逸专属","is_have":"2","level_tips":"很抱歉，该特权为荣誉及云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"23","tq_name":"紧急SOS","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-23.png","tq_content":"云逸专属：如果您遇到突发事件、到店无房等紧急情况时，可直接点击紧急按钮，专人管家极速接入并致电会员，享有优先服务特权。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/23.jpg","tq_px":"-4","tq_px1":"24","tq_px2":"23","tq_px3":"13","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"11","tq_name":"海外医疗","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-11.png","tq_content":"云逸专属：工作繁忙之余，自身的健康状况也应该是高度关注的问题，青年黑卡提供海外医疗等健康解决方案，为每一位持卡人的身体管理保驾护航。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/11.jpg","tq_px":"-2","tq_px1":"25","tq_px2":"24","tq_px3":"19","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"3","tq_name":"社交酒会","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-03.png","tq_content":"云逸专属：不定期为持卡人提供名人明星社交酒会邀请资格，如美国总统国会山就职演讲邀请、华裔小姐大赛观礼、国内知名电影节邀请等。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/3.jpg","tq_px":"-5","tq_px1":"26","tq_px2":"25","tq_px3":"11","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"29","tq_name":"法律顾问","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-22.png","tq_content":"云逸专属: 贴身法律顾问，需要法律咨询、法律维权和民事纠纷诉讼等情况时可联系黑卡管家，为您提供最专业的法律援助。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/30.jpg","tq_px":"-3","tq_px1":"27","tq_px2":"26","tq_px3":"4","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"},{"tq_id":"6","tq_name":"私人飞机","tq_ico":"http://s.qing-hei.com/Public/new/app/images/privilegeico2/ico-06.png","tq_content":"云逸专属：可选择机型包括：莱格赛650、莱格赛500、比亚乔P180、挑战者850等，同时可选择涵盖在内的首都机场CIP贵宾礼遇，独有的拼机服务，让会员有机会享受更低的价格乘坐私人飞机出行。","tq_img":"http://s.qing-hei.com/Public/new/app/images/privilegeimg/6.jpg","tq_px":"-6","tq_px1":"28","tq_px2":"27","tq_px3":"2","tq_type":"0","tq_web":"","tq_have":"3","tq_biaoshi":"云逸专属","is_have":"3","level_tips":"很抱歉，该特权为云逸会籍专属特权，您可通过会籍升级享有此特权"}]
         */

        private String head;
        private String cardid;
        private String level;
        private String time;
        private String name;
        private String nickname;
        private String sex;
        private int asset;
        private String cardmoney;
        private String frozenmonye;
        private String moneytips;
        private String cert_pic;
        private String certification;
        private String introinfo;
        private int privilegenum;
        private List<PushmsgBean> pushmsg;
        private List<PrivilegeBean> privilege;

        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public String getCardid() {
            return cardid;
        }

        public void setCardid(String cardid) {
            this.cardid = cardid;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getAsset() {
            return asset;
        }

        public void setAsset(int asset) {
            this.asset = asset;
        }

        public String getCardmoney() {
            return cardmoney;
        }

        public void setCardmoney(String cardmoney) {
            this.cardmoney = cardmoney;
        }

        public String getFrozenmonye() {
            return frozenmonye;
        }

        public void setFrozenmonye(String frozenmonye) {
            this.frozenmonye = frozenmonye;
        }

        public String getMoneytips() {
            return moneytips;
        }

        public void setMoneytips(String moneytips) {
            this.moneytips = moneytips;
        }

        public String getCert_pic() {
            return cert_pic;
        }

        public void setCert_pic(String cert_pic) {
            this.cert_pic = cert_pic;
        }

        public String getCertification() {
            return certification;
        }

        public void setCertification(String certification) {
            this.certification = certification;
        }

        public String getIntroinfo() {
            return introinfo;
        }

        public void setIntroinfo(String introinfo) {
            this.introinfo = introinfo;
        }

        public int getPrivilegenum() {
            return privilegenum;
        }

        public void setPrivilegenum(int privilegenum) {
            this.privilegenum = privilegenum;
        }

        public List<PushmsgBean> getPushmsg() {
            return pushmsg;
        }

        public void setPushmsg(List<PushmsgBean> pushmsg) {
            this.pushmsg = pushmsg;
        }

        public List<PrivilegeBean> getPrivilege() {
            return privilege;
        }

        public void setPrivilege(List<PrivilegeBean> privilege) {
            this.privilege = privilege;
        }

        public static class PushmsgBean {
            /**
             * push_id : 4
             * push_title : 【New Life】云南普洱百年古茶树认领
             * push_title2 : 挂牌证书/价值6000元以上7块茶饼
             * push_url : http://www.qing-hei.com/mobile.php/welfare/info/id/112/type/1/
             * push_pic : http://s.qing-hei.com/Public/Uploads/5937ce1c98ba2.jpg
             */

            private String push_id;
            private String push_title;
            private String push_title2;
            private String push_url;
            private String push_pic;

            public String getPush_id() {
                return push_id;
            }

            public void setPush_id(String push_id) {
                this.push_id = push_id;
            }

            public String getPush_title() {
                return push_title;
            }

            public void setPush_title(String push_title) {
                this.push_title = push_title;
            }

            public String getPush_title2() {
                return push_title2;
            }

            public void setPush_title2(String push_title2) {
                this.push_title2 = push_title2;
            }

            public String getPush_url() {
                return push_url;
            }

            public void setPush_url(String push_url) {
                this.push_url = push_url;
            }

            public String getPush_pic() {
                return push_pic;
            }

            public void setPush_pic(String push_pic) {
                this.push_pic = push_pic;
            }
        }

        public static class PrivilegeBean {
            /**
             * tq_id : 1
             * tq_name : 顶级管家
             * tq_ico : http://s.qing-hei.com/Public/new/app/images/privilegeico/ico-01.png
             * tq_content : 省时省心，100%权益保障，顶级管家团队为您妥善打理生活。只需发条消息管家便可安排好一切，全方位满足会员需求。
             * tq_img : http://s.qing-hei.com/Public/new/app/images/privilegeimg/1.jpg
             * tq_px : 0
             * tq_px1 : 0
             * tq_px2 : 0
             * tq_px3 : 0
             * tq_type : 0
             * tq_web :
             * tq_have : 1
             * tq_biaoshi :
             * is_have : 1
             * level_tips :
             */

            private String tq_id;
            private String tq_name;
            private String tq_ico;
            private String tq_content;
            private String tq_img;
            private String tq_px;
            private String tq_px1;
            private String tq_px2;
            private String tq_px3;
            private String tq_type;
            private String tq_web;
            private String tq_have;
            private String tq_biaoshi;
            private String is_have;
            private String level_tips;

            public String getTq_id() {
                return tq_id;
            }

            public void setTq_id(String tq_id) {
                this.tq_id = tq_id;
            }

            public String getTq_name() {
                return tq_name;
            }

            public void setTq_name(String tq_name) {
                this.tq_name = tq_name;
            }

            public String getTq_ico() {
                return tq_ico;
            }

            public void setTq_ico(String tq_ico) {
                this.tq_ico = tq_ico;
            }

            public String getTq_content() {
                return tq_content;
            }

            public void setTq_content(String tq_content) {
                this.tq_content = tq_content;
            }

            public String getTq_img() {
                return tq_img;
            }

            public void setTq_img(String tq_img) {
                this.tq_img = tq_img;
            }

            public String getTq_px() {
                return tq_px;
            }

            public void setTq_px(String tq_px) {
                this.tq_px = tq_px;
            }

            public String getTq_px1() {
                return tq_px1;
            }

            public void setTq_px1(String tq_px1) {
                this.tq_px1 = tq_px1;
            }

            public String getTq_px2() {
                return tq_px2;
            }

            public void setTq_px2(String tq_px2) {
                this.tq_px2 = tq_px2;
            }

            public String getTq_px3() {
                return tq_px3;
            }

            public void setTq_px3(String tq_px3) {
                this.tq_px3 = tq_px3;
            }

            public String getTq_type() {
                return tq_type;
            }

            public void setTq_type(String tq_type) {
                this.tq_type = tq_type;
            }

            public String getTq_web() {
                return tq_web;
            }

            public void setTq_web(String tq_web) {
                this.tq_web = tq_web;
            }

            public String getTq_have() {
                return tq_have;
            }

            public void setTq_have(String tq_have) {
                this.tq_have = tq_have;
            }

            public String getTq_biaoshi() {
                return tq_biaoshi;
            }

            public void setTq_biaoshi(String tq_biaoshi) {
                this.tq_biaoshi = tq_biaoshi;
            }

            public String getIs_have() {
                return is_have;
            }

            public void setIs_have(String is_have) {
                this.is_have = is_have;
            }

            public String getLevel_tips() {
                return level_tips;
            }

            public void setLevel_tips(String level_tips) {
                this.level_tips = level_tips;
            }
        }
    }
}
