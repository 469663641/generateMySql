package generator;


import java.sql.Types;
import org.mybatis.generator.api.JavaTypeResolver;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 *
 * Created by xww1 on 2016/8/7.
 */

public class JavaTypeResolverCustomImpl extends JavaTypeResolverDefaultImpl implements JavaTypeResolver {

    public JavaTypeResolverCustomImpl() {
        super();

//        typeMap.put(Types.TINYINT, new JavaTypeResolverDefaultImpl.JdbcTypeInformation("TINYINT",
//                new FullyQualifiedJavaType(Byte.class.getName())));
    }
}
