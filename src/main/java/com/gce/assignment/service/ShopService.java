package com.gce.assignment.service;

import java.util.List;

import com.gce.assignment.model.ShopTO;

public interface ShopService {
	public ShopTO persistShop(ShopTO s);
	public List<ShopTO> getAll();
}
