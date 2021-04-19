package study.java.daoex.dao.impl;

import study.java.daoex.dao.DepartmentDao;
import study.java.daoex.model.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {

    /** 데이터베이스 접속 객체 */
    private Connection conn;

    /** 생성자를 통해서 데이터베이스 접속 객체를 전달 받는다. */
    public DepartmentDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int insert(Department params) {
        int result = 0;

        /** 실행할 SQL 구문 정의 */
        String sql = "INSERT INTO department (dname, loc) VALUES (?, ?)";


        /** SQL 구문 실행하기 위한 객체 */
        // --> import java.sql.PreparedStatement;
        PreparedStatement pstmt = null;
        // --> import java.sql.ResultSet;
        ResultSet rs = null;

        /** SQL 구문 처리하기 */
        try {
            // pstmt 객체 할당
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // 템플릿에 데이터 설정
            pstmt.setString(1, params.getDname());
            pstmt.setString(2, params.getLoc());

            // SQL문 실행하기 --> 결과 행의 수를 리턴할 변수에 대입함
            pstmt.executeUpdate();

            // Primary Key 받기
            rs = pstmt.getGeneratedKeys();
            rs.next();
            result = rs.getInt(1);


        } catch (SQLException e) {
            System.out.println("MySQL SQL Fail : " + e.getMessage());
        } finally {
            if (rs != null) {
                // 객체 닫기
                try {
                    rs.close();
                } catch (Exception e) { }
            }

            if (pstmt != null) {
                // 객체 닫기
                try {
                    pstmt.close();
                } catch (SQLException e) { }
            }
        }

        return result;
    }

    @Override
    public int delete(int params) {
        int result = 0;

        /** 실행할 SQL구문 정의 */
        String sql = "DELETE FROM department WHERE deptno=?";

        /** SQL 구문 실행하기 위한 객체 */
        // --> import java.sql.PreparedStatement;
        PreparedStatement pstmt = null;

        /** SQL 구문 처리하기 */
        try {
            // pstmt 객체 할당
            pstmt = conn.prepareStatement(sql);

            // 템플릿에 데이터 설정
            pstmt.setInt(1, params);

            // SQL문 실행하기 --> 결과 행의 수를 리턴할 변수에 대입함
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("MySQL SQL Fail : " + e.getMessage());
        } finally {
            if (pstmt != null) {
                // 객체 닫기
                try {
                    pstmt.close();
                } catch (SQLException e) { }
            }
        }
        return result;
    }

    @Override
    public int update(Department params) {
        int result = 0;

        /** 실행할 SQL구문 정의 */
        String sql = "UPDATE department SET dname=?, loc=? WHERE deptno=?";

        /** SQL 구문 실행하기 위한 객체 */
        // --> import java.sql.PreparedStatement;
        PreparedStatement pstmt = null;

        /** SQL 구문 처리하기 */
        try {
            // pstmt 객체 할당
            pstmt = conn.prepareStatement(sql);

            // 템플릿에 데이터 설정
            pstmt.setString(1, params.getDname());
            pstmt.setString(2, params.getLoc());
            pstmt.setInt(3, params.getDeptno());

            // SQL문 실행하기
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("MySQL SQL Fail : " + e.getMessage());
        } finally {
            if (pstmt != null) {
                // 객체닫기
                try {
                    pstmt.close();
                } catch (SQLException e) { }
            }
        }
        return result;
    }

    /** 한 건의 데이터를 조회하느 기능 */
    // 조회 대상이 되는 Primary key의 값을 파라미터로 전달한다.
    @Override
    public Department selectOne(int params) {
        Department result = null;

        /** 실행할 SQL구문 정의 */
        String sql  = "SELECT deptno, dname, loc FROM department WHERE deptno=?";

        /** SQL 구문 실행하기 위한 객체 */
        // --> import java.sql.PreparedStatement;
        PreparedStatement pstmt = null;
        // --> import java.sql.ResultSet;
        ResultSet rs = null;

        /** SQL 구문 처리하기 */
        try {
            // pstmt 객체 할당
            pstmt = conn.prepareStatement(sql);

            // 템플릿에 데이터 설정
            pstmt.setInt(1, params);

            // SQL문 실행하기 --> 결과 행 리턴됨
            rs = pstmt.executeQuery();

            // 조회 결과의 첫 번째 줄로 이동
            boolean first = rs.next();

            // 조회 결과가 존재하는 경우 변수를 JavaBeans로 생성하기
            // 2개 이상의 값을 리턴 할 수 없지만, JavaBeans로 묶으면 여러 개의 값을 하나의 객체로 생성하여 리턴 할 수 있다.

            if (first) {
                // SELECT절에 명시한 칼럼 이름을 사용하여 데이터 추출
                int deptno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");

                // 리턴할 객체에 조회한 값을 사용하여 객체를 할당한다.
                result = new Department(deptno, dname, loc);
            } else {
                System.out.println("조회 결과가 없습니다.");
            }

        } catch (SQLException e) {
            System.out.println("MySQL SQL Fail : " + e.getMessage());
        } finally {
            // 객체를 생성한 순서의 역순으로 객체를 닫는다.
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) { }
            }

            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) { }
            }
        }
        return result;
    }

    // 복수 행을 조회하고 그 결과를 일괄적으로 리턴하기 위한 메서드
    // 단일 행의 결과를 리턴하는 경우 --> JavaBeans 객체를 리턴
    // 복수 행의 결과를 리턴하는 경우 --> JavaBeans를 포함하는 컬렉션을 리턴
    @Override
    public List<Department> select() {
        List<Department> result = null;

        // 'department' 테이블에 데이터를 갱신하기 위한 SQL의 템플릿
        String sql = "SELECT deptno, dname, loc FROM department";

        /** SQL 구문 실행하기 위한 객체 */
        // --> import java.sql.PreparedStatement;
        PreparedStatement pstmt = null;
        // --> import java.sql.ResultSet;
        ResultSet rs = null;

        /** 데이터 조회 과정 구현 */
        try {
            // pstmt 객체 할당
            pstmt = conn.prepareStatement(sql);

            // SELECT 구문을 실행한 후, 결과셋을 리턴받는다.
            rs = pstmt.executeQuery(sql);

            /** SQL결과를 컬렉션에 할당 */
            // SQL이 실행되므로 컬렉션을 할당한다.
            result = new ArrayList<Department>();

            // 한 줄씩 스캔하는 반복문 구성
            while (rs.next()) {
                int deptno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");

                Department item = new Department(deptno, dname, loc);
                result.add(item);
            }

        } catch (SQLException e) {
            System.out.println("MySQL SQL Fail : " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) { }
            }

            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) { }
            }
        }
        return result;
    }
}
