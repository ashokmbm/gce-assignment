package com.gce.assignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gce.assignment.adapter.ShopServiceAdapter;
import com.gce.assignment.entity.Shop;
import com.gce.assignment.model.ShopTO;
import com.gce.assignment.repository.ShopRepository;
import com.gce.assignment.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	ShopRepository shopRepository;

	@Autowired
	ShopServiceAdapter shopServiceAdapter;

	@Override
	public ShopTO persistShop(ShopTO shopTO) {
		Shop shop = shopServiceAdapter.getShopEntity(shopTO);
		shop = shopRepository.save(shop);
		return shopServiceAdapter.getShopTO(shop);
	}

	@Override
	public List<ShopTO> getAll() {
		List<Shop> list = (List<Shop>) shopRepository.findAll();
		List<ShopTO> listTO = shopServiceAdapter.getShopTOList(list);
		return listTO;
	}
}
