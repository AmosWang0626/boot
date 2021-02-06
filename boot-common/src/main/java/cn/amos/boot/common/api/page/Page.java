package cn.amos.boot.common.api.page;

/**
 * DESCRIPTION: Page
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/6
 */
public class Page {

    private Integer page;
    private Integer size;

    public Integer getFirstIndex() {
        return (page - 1) * size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}
