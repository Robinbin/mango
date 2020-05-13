package com.jws.mango.admin.service.impl;

import com.jws.mango.admin.mapper.SysUserMapper;
import com.jws.mango.admin.mapper.SysUserRoleMapper;
import com.jws.mango.admin.model.SysUser;
import com.jws.mango.admin.model.SysUserRole;
import com.jws.mango.admin.service.SysUserService;
import com.jws.mango.admin.util.DateTimeUtils;
import com.jws.mango.admin.util.PoiUtils;
import com.jws.mango.core.mapper.CommonMapper;
import com.jws.mango.core.page.PageRequest;
import com.jws.mango.core.page.PageResult;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class SysUserServiceImpl extends CurdServiceImpl<SysUser, Long> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    protected CommonMapper<SysUser, Long> getCommonMapper() {
        return sysUserMapper;
    }

    @Override
    public int save(SysUser sysUser) {
        if (sysUser.getId() == null || sysUser.getId() == 0) {
            return add(sysUser);
        } else {
            return update(sysUser);
        }
    }

    @Override
    public SysUser findByName(String name) {
        List<SysUser> sysUsers = sysUserMapper.findByName(name);
        if (sysUsers.isEmpty()) {
            return null;
        } else {
            return sysUsers.get(0);
        }
    }

    @Override
    public Set<String> findPermissions(String name) {
        return sysUserRoleMapper.findPermissions(name);
    }

    @Override
    public List<SysUserRole> findUserRoles(Long userid) {
        return sysUserRoleMapper.findUserRoles(userid);
    }

    @Override
    public File createUserExcelFile(PageRequest pageRequest) {
        PageResult pageResult = findPage(pageRequest);

        return createUserExcelFile(pageResult.getContents());
    }

    private File createUserExcelFile(List<?> contents) {
        if(contents == null){
            contents = new ArrayList<>();
        }

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        Row row0 = sheet.createRow(0);
        int columnIndex = 0;
        row0.createCell(columnIndex).setCellValue("No");
        row0.createCell(++columnIndex).setCellValue("ID");
        row0.createCell(++columnIndex).setCellValue("用户名");
        row0.createCell(++columnIndex).setCellValue("呢称");
        row0.createCell(++columnIndex).setCellValue("机构");
        row0.createCell(++columnIndex).setCellValue("角色");
        row0.createCell(++columnIndex).setCellValue("邮箱");
        row0.createCell(++columnIndex).setCellValue("手机号");
        row0.createCell(++columnIndex).setCellValue("状态");
        row0.createCell(++columnIndex).setCellValue("头像");
        row0.createCell(++columnIndex).setCellValue("创建人");
        row0.createCell(++columnIndex).setCellValue("最后更新人");
        row0.createCell(++columnIndex).setCellValue("最后更新时间");
        for (int i = 0;i<contents.size();i++) {
            SysUser user = (SysUser) contents.get(i);
            Row row = sheet.createRow(i);
            for (int j = 0; j < columnIndex + 1; j++) {
                row.createCell(j);
            }
            columnIndex = 0;
            row.getCell(columnIndex).setCellValue(i + 1);
            row.getCell(++columnIndex).setCellValue(user.getId());
            row.getCell(++columnIndex).setCellValue(user.getName());
            row.getCell(++columnIndex).setCellValue(user.getNickName());
            row.getCell(++columnIndex).setCellValue(user.getDeptName());
            row.getCell(++columnIndex).setCellValue(user.getRoleNames());
            row.getCell(++columnIndex).setCellValue(user.getEmail());
            row.getCell(++columnIndex).setCellValue(user.getStatus());
            row.getCell(++columnIndex).setCellValue(user.getAvatar());
            row.getCell(++columnIndex).setCellValue(user.getCreateBy());
            row.getCell(++columnIndex).setCellValue(DateTimeUtils.getDateTime(user.getCreateTime()));
            row.getCell(++columnIndex).setCellValue(user.getLastUpdateBy());
            row.getCell(++columnIndex).setCellValue(DateTimeUtils.getDateTime(user.getLastUpdateTime()));
        }
        return PoiUtils.createExcelFile(workbook, "download_user");
    }














}
