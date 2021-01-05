package com.pdd.service.ranking;

import com.pdd.util.redis.RedisUtil;
import org.springframework.boot.rsocket.server.RSocketServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author pdd
 * @email pengdingding@lumlord.com
 * @date 2021/1/4  16:16:16
 * @description 描述
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //            佛祖保佑       永不宕机     永无BUG                  //
 * ////////////////////////////////////////////////////////////////////
 */
@Service
public class RankingServiceImpl implements RankingService{

    @Resource
    private RedisUtil redisUtil;

    @Override
    public void addMaintain() {

        redisUtil.zAdd("maintain","尼古拉斯赵四",53);
        redisUtil.zAdd("maintain","喜马拉雅张三",54);
        redisUtil.zAdd("maintain","普拉多王五",55);
        redisUtil.zAdd("maintain","凯奇觉醒者麻子",56);
        redisUtil.zAdd("maintain","pdd",0);

    }
}
