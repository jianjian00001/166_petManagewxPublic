package com.cl.entity.view;

import com.cl.entity.ChongwukepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 宠物科普
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-16 17:42:45
 */
@TableName("chongwukepu")
public class ChongwukepuView  extends ChongwukepuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwukepuView(){
	}
 
 	public ChongwukepuView(ChongwukepuEntity chongwukepuEntity){
 	try {
			BeanUtils.copyProperties(this, chongwukepuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
