package com.gce.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gce.assignment.constant.URIConstant;
import com.gce.assignment.model.ShopTO;
import com.gce.assignment.service.ShopService;

@RestController
@RequestMapping("api/")
public class ShopController {
	@Autowired
	ShopService shopService;

	@PostMapping(value = URIConstant.SHOP)
	public ResponseEntity<ShopTO> persistShop(@RequestBody ShopTO shopRequest) {

		ShopTO persistedShop = shopService.persistShop(shopRequest);

		return new ResponseEntity<ShopTO>(persistedShop, HttpStatus.CREATED);
	}

	@GetMapping(value = URIConstant.SHOPS)
	public ResponseEntity<List<ShopTO>> listShop() {

		List<ShopTO> shopList = shopService.getAll();
		System.out.println("===>>>"+shopList.size());

		return new ResponseEntity<List<ShopTO>>(shopList, HttpStatus.OK);
	}
}
