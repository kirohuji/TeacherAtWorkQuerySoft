/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.kirohuji.common.filter;

import com.alibaba.druid.support.http.WebStatFilter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 *
 * @author zyd
 */
/**
 * 配置druid监控统计功能
 * 配置Filter
 * @author ZSX
 *
 */

@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
    initParams = {
            @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
    }
)

public class DruidStatFilter extends WebStatFilter {

}