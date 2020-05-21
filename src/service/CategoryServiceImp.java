package service;

import model.Category;
import model.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImp implements CategoryService {

    public static final String SELECT_ALL_CATEGORY = "SELECT * FROM atagvn.category";

    @Override
    public List<Category> getListCategory() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = SELECT_ALL_CATEGORY;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Category> list = new ArrayList<>();
        while (rs.next()) {
            Category category = new Category();
            category.setCategoryId(rs.getString("CategoryID"));
            category.setCategoryName(rs.getString("CategoryName"));
            list.add(category);
        }
        return list;
    }


    public Category getCategory(String categoryId) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql =  "select * from atagvn.category where CategoryID=  '"+categoryId+"'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Category category = new Category();
        while (rs.next()) {
            category.setCategoryId(rs.getString("CategoryID"));
            category.setCategoryName(rs.getString("CategoryName"));
        }
        return category;
    }

    @Override
    public void updateCategory(Category category) {
        Connection connection = DBConnect.getConnection();
        String sql = "update category set CategoryName = ? where CategoryID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,category.getCategoryName());
            ps.setString(2,category.getCategoryId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void main(String[] args) {
        CategoryServiceImp categoryServiceImp = new CategoryServiceImp();
        try {
            for (Category c : categoryServiceImp.getListCategory()
            ) {
                System.out.println(c.getCategoryName());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
