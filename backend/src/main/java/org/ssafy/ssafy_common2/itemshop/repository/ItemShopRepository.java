package org.ssafy.ssafy_common2.itemshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ssafy.ssafy_common2.itemshop.entity.Enforcement;
import org.ssafy.ssafy_common2.itemshop.entity.ItemShop;

public interface ItemShopRepository extends JpaRepository<ItemShop,Long> {
}
