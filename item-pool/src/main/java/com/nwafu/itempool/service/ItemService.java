package com.nwafu.itempool.service;

import com.nwafu.itempool.module.BaseRequest;
import com.nwafu.itempool.module.UpdateRequest;

import java.util.List;

public interface ItemService {

    List getItems(Integer page, Integer limit);

    void insert(BaseRequest request);

    void delete(Integer id);

    void batchDelete(String ids);

    void update(UpdateRequest request);
}
