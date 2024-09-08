package com.cl.entity.view;

import com.cl.entity.MenuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 菜单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-16 17:42:46
 */
@TableName("menu")
public class MenuView  extends MenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MenuView(){
	}
 
 	public MenuView(MenuEntity menuEntity){
 	try {
			BeanUtils.copyProperties(this, menuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
