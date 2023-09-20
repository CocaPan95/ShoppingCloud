package com.shop.model.service.impl;

import com.shop.model.entity.Company;
import com.shop.model.mapper.CompanyMapper;
import com.shop.model.service.ICompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
