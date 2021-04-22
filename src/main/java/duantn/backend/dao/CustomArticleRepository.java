package duantn.backend.dao;

import duantn.backend.model.entity.Article;

import java.util.List;
import java.util.Map;

public interface CustomArticleRepository {
    List<Article> findCustom(String sort, Long start, Long end,
                             Integer ward, Integer district, Integer city,
                             Boolean roommate,
                             String status, Boolean vip, String search,
                             Integer minAcreage, Integer maxAcreage,
                             Integer page, Integer limit);

    Map<String, Long> findCustomCount(Long start, Long end,
                        Integer ward, Integer district, Integer city,
                        Boolean roommate,
                        String status, Boolean vip, String search,
                        Integer minAcreage, Integer maxAcreage, Integer limit);

    List<Article> findCustomAndEmail(String email, String sort, Long start, Long end,
                                     Integer ward, Integer district, Integer city,
                                     Boolean roommate,
                                     String status, Boolean vip, String search,
                                     Integer minAcreage, Integer maxAcreage,
                                     Integer page, Integer limit);
    Map<String, Long> findCustomAndEmailCount(String email, Long start, Long end,
                                     Integer ward, Integer district, Integer city,
                                     Boolean roommate,
                                     String status, Boolean vip, String search,
                                     Integer minAcreage, Integer maxAcreage, Integer limit);

    List<Article> findCustomShow(Long start, Long end,
                                        Integer ward, Integer district, Integer city,
                                        Boolean roommate,
                                        String status, String search,
                                        Integer minAcreage, Integer maxAcreage,
                                        Integer page, Integer limit);
    Map<String, Long> findCustomShowCount(Long start, Long end,
                                 Integer ward, Integer district, Integer city,
                                 Boolean roommate,
                                 String status, String search,
                                 Integer minAcreage, Integer maxAcreage, Integer limit);
}
