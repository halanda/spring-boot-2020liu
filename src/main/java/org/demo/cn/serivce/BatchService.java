package org.demo.cn.serivce;

import java.util.List;

import org.demo.cn.model.Yesterday;

public interface BatchService {

	Integer insertBatch(List<Yesterday> yesList);
}