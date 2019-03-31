package com.example.baijunling0329.model;

import java.util.List;


public class JsonBean {


    private int httpStatusCode;
    private int code;
    private DataBeanX data;

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {


        private int page;
        private int perpage;
        private int max_page;
        private int total;
        private ExtrasBean extras;
        private String bindtips;
        private List<DataBean> data;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPerpage() {
            return perpage;
        }

        public void setPerpage(int perpage) {
            this.perpage = perpage;
        }

        public int getMax_page() {
            return max_page;
        }

        public void setMax_page(int max_page) {
            this.max_page = max_page;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public ExtrasBean getExtras() {
            return extras;
        }

        public void setExtras(ExtrasBean extras) {
            this.extras = extras;
        }

        public String getBindtips() {
            return bindtips;
        }

        public void setBindtips(String bindtips) {
            this.bindtips = bindtips;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class ExtrasBean {
            private List<SliderBean> slider;

            public List<SliderBean> getSlider() {
                return slider;
            }

            public void setSlider(List<SliderBean> slider) {
                this.slider = slider;
            }

            public static class SliderBean {


                private int id;
                private String pic;
                private String link;
                private String t;
                private int inner_news;
                private String title;
                private String type;
                private String type_sign;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getT() {
                    return t;
                }

                public void setT(String t) {
                    this.t = t;
                }

                public int getInner_news() {
                    return inner_news;
                }

                public void setInner_news(int inner_news) {
                    this.inner_news = inner_news;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getType_sign() {
                    return type_sign;
                }

                public void setType_sign(String type_sign) {
                    this.type_sign = type_sign;
                }
            }
        }

        public static class DataBean {


            private int id;
            private String title;
            private String link;
            private String t;
            private String type;
            private String alias;
            private int pic_amount;
            private String style;
            private int comment_amount;
            private String source;
            private String type_sign;
            private int inner_news;
            private int views;
            private String comment_amount_label;
            private String views_label;
            private List<String> pics;
            private List<String> pics_new;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getT() {
                return t;
            }

            public void setT(String t) {
                this.t = t;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public int getPic_amount() {
                return pic_amount;
            }

            public void setPic_amount(int pic_amount) {
                this.pic_amount = pic_amount;
            }

            public String getStyle() {
                return style;
            }

            public void setStyle(String style) {
                this.style = style;
            }

            public int getComment_amount() {
                return comment_amount;
            }

            public void setComment_amount(int comment_amount) {
                this.comment_amount = comment_amount;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType_sign() {
                return type_sign;
            }

            public void setType_sign(String type_sign) {
                this.type_sign = type_sign;
            }

            public int getInner_news() {
                return inner_news;
            }

            public void setInner_news(int inner_news) {
                this.inner_news = inner_news;
            }

            public int getViews() {
                return views;
            }

            public void setViews(int views) {
                this.views = views;
            }

            public String getComment_amount_label() {
                return comment_amount_label;
            }

            public void setComment_amount_label(String comment_amount_label) {
                this.comment_amount_label = comment_amount_label;
            }

            public String getViews_label() {
                return views_label;
            }

            public void setViews_label(String views_label) {
                this.views_label = views_label;
            }

            public List<String> getPics() {
                return pics;
            }

            public void setPics(List<String> pics) {
                this.pics = pics;
            }

            public List<String> getPics_new() {
                return pics_new;
            }

            public void setPics_new(List<String> pics_new) {
                this.pics_new = pics_new;
            }
        }
    }
}
