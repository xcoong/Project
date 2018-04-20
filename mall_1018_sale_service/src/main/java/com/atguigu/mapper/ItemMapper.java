package com.atguigu.mapper;

import java.util.List;
import java.util.Map;

import com.atguigu.bean.DETAIL_T_MALL_SKU;
import com.atguigu.bean.T_MALL_SKU;

public interface ItemMapper {

	public List<T_MALL_SKU> select_skuList_by_spu(int spu_id);

	public DETAIL_T_MALL_SKU select_detail_sku(Map<Object, Object> Map);

	

}
