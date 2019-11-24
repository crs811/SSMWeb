import com.crs811.dao.PaperDao;
import com.crs811.pojo.Paper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PaperDaoTest {

    @Autowired
    private PaperDao paperDao;

    @Test
    public void testFindPaperById() {
        int id = 2;
        Paper paper = paperDao.queryById(id);

        if (paper != null) {
            System.out.println("====" + paper.getPaperId() + ":" + paper.getPaperName() + ":" + paper.getPaperNum() + ":" + paper.getPaperDetail());
        } else {
            System.out.println("==== NULL");
        }

    }
}

