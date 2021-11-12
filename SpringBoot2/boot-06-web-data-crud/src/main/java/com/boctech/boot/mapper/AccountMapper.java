package com.boctech.boot.mapper;

import com.boctech.boot.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/10- 20:56
 * Description:
 */
//@Mapper
public interface AccountMapper {

    Account getAcct(Long id);

}
