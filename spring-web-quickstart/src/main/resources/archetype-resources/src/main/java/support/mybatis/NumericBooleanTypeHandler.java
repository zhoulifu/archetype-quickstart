package ${package}.support.mybatis;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class NumericBooleanTypeHandler extends BaseTypeHandler<Boolean> {
    private static final byte VAL_TRUE = 1;
    private static final byte VAL_FALSE = 0;

    public NumericBooleanTypeHandler() {
    }

    public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
        ps.setByte(i, (parameter) ? VAL_TRUE : VAL_FALSE);
    }

    public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getByte(columnName) == VAL_TRUE;
    }

    public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return rs.getByte(columnIndex) == VAL_TRUE;
    }

    public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getByte(columnIndex) == VAL_TRUE;
    }
}
