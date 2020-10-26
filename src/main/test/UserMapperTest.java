import com.arner.mybatis.entity.User;
import com.arner.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserMapperTest {
    public static void main(String[] args) {
        //工厂模式
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                UserMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        // 原生mybatis 默认为 false
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User();
//        user.setUsername("omg");
//        user.setPassword("123456");
//        int insert = mapper.insert(user);
//        System.out.println(insert);
        User user = mapper.selectById(2);
        System.out.println(user.toString());
    }
}
