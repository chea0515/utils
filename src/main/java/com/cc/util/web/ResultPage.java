package com.cc.util.web;

import java.util.Collection;
import java.util.LinkedList;

public class ResultPage<T> {
    private Boolean success = true;
    private Page<T> page = new Page<>();

    public static class Page<T> {
        private Integer pageNum;
        private Integer pageSize;
        private Integer totalCount;
        private Collection<T> result;

        public Page withPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public Page withPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Page withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Page withResult(Collection<T> result) {
            if(result == null) {
                this.result= new LinkedList<>();
            } else {
                this.result = result;
            }
            return this;
        }

        public Integer getTotalPage() {
            if(totalCount > 0 && pageSize > 0) {
                return (totalCount % pageSize == 0) ?
                        (totalCount / pageSize) : (totalCount / pageSize) + 1;

            }
            return 0;
        }

        public Integer getPageNum() {
            return pageNum;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public Collection<T> getResult() {
            return result;
        }

        public void setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public void setResult(Collection<T> result) {
            this.result = result;
        }
    }

    public Boolean getSuccess() {
        return success;
    }

    public Page<T> getPage() {
        return page;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setPage(Page<T> page) {
        this.page = page;
    }
}
