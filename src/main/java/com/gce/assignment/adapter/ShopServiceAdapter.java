package com.gce.assignment.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gce.assignment.entity.Shop;
import com.gce.assignment.model.ShopTO;

@Component
public class ShopServiceAdapter {
	public Shop getShopEntity(ShopTO s) {
		Shop shop = new Shop();
		shop.setName(s.getName());
		shop.setOwnerName(s.getOwnerName());
		return shop;
	}

	public ShopTO getShopTO(Shop s) {
		ShopTO shop = new ShopTO();
		shop.setName(s.getName());
		shop.setOwnerName(s.getOwnerName());
		return shop;
	}

	public List<ShopTO> getShopTOList(List<Shop> list) {
		List<ShopTO> listTO = new ArrayList<ShopTO>();
		for (Shop s : list) {
			ShopTO shopTO = this.getShopTO(s);
			listTO.add(shopTO);
		}
		return listTO;
	}
}
