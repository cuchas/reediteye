package com.example.eduardocucharro.reediteye.reedit;

import java.util.List;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class CommentsResponse {

    private String kind;
    private DataBeanXXXXX data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DataBeanXXXXX getData() {
        return data;
    }

    public void setData(DataBeanXXXXX data) {
        this.data = data;
    }

    public static class DataBeanXXXXX {

        private String modhash;
        private Object after;
        private Object before;
        private List<ChildrenBeanXX> children;

        public String getModhash() {
            return modhash;
        }

        public void setModhash(String modhash) {
            this.modhash = modhash;
        }

        public Object getAfter() {
            return after;
        }

        public void setAfter(Object after) {
            this.after = after;
        }

        public Object getBefore() {
            return before;
        }

        public void setBefore(Object before) {
            this.before = before;
        }

        public List<ChildrenBeanXX> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBeanXX> children) {
            this.children = children;
        }

        public static class ChildrenBeanXX {

            private String kind;
            private DataBeanXXXX data;

            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public DataBeanXXXX getData() {
                return data;
            }

            public void setData(DataBeanXXXX data) {
                this.data = data;
            }

            public static class DataBeanXXXX {
                private String subreddit_id;
//                private Object banned_by;
//                private Object removal_reason;
//                private String link_id;
                private Object likes;
//                private RepliesBeanX replies;
//                private boolean saved;
                private String id;
                private int gilded;
//                private boolean archived;
                private int score;
//                private Object report_reasons;
                private String author;
//                private String parent_id;
                private String subreddit_name_prefixed;
//                private Object approved_by;
//                private int controversiality;
                public String body;
//                private boolean edited;
//                private String author_flair_css_class;
//                private int downs;
                public String body_html;
//                private boolean stickied;
//                private boolean can_gild;
                private String subreddit;
//                private boolean score_hidden;
                private String subreddit_type;
                private String name;
//                private double created;
//                private String author_flair_text;
                private String created_utc;
//                private int ups;
//                private int depth;
                private Object num_reports;
//                private Object distinguished;
//                private List<?> user_reports;
//                private List<?> mod_reports;

                public String getSubreddit_id() {
                    return subreddit_id;
                }

                public void setSubreddit_id(String subreddit_id) {
                    this.subreddit_id = subreddit_id;
                }

//                public Object getBanned_by() {
//                    return banned_by;
//                }
//
//                public void setBanned_by(Object banned_by) {
//                    this.banned_by = banned_by;
//                }
//
//                public Object getRemoval_reason() {
//                    return removal_reason;
//                }
//
//                public void setRemoval_reason(Object removal_reason) {
//                    this.removal_reason = removal_reason;
//                }
//
//                public String getLink_id() {
//                    return link_id;
//                }
//
//                public void setLink_id(String link_id) {
//                    this.link_id = link_id;
//                }

                public Object getLikes() {
                    return likes;
                }

                public void setLikes(Object likes) {
                    this.likes = likes;
                }

//                public RepliesBeanX getReplies() {
//                    return replies;
//                }
//
//                public void setReplies(RepliesBeanX replies) {
//                    this.replies = replies;
//                }

//                public boolean isSaved() {
//                    return saved;
//                }
//
//                public void setSaved(boolean saved) {
//                    this.saved = saved;
//                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public int getGilded() {
                    return gilded;
                }

                public void setGilded(int gilded) {
                    this.gilded = gilded;
                }

//                public boolean isArchived() {
//                    return archived;
//                }
//
//                public void setArchived(boolean archived) {
//                    this.archived = archived;
//                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

//                public Object getReport_reasons() {
//                    return report_reasons;
//                }
//
//                public void setReport_reasons(Object report_reasons) {
//                    this.report_reasons = report_reasons;
//                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }

//                public String getParent_id() {
//                    return parent_id;
//                }
//
//                public void setParent_id(String parent_id) {
//                    this.parent_id = parent_id;
//                }

                public String getSubreddit_name_prefixed() {
                    return subreddit_name_prefixed;
                }

                public void setSubreddit_name_prefixed(String subreddit_name_prefixed) {
                    this.subreddit_name_prefixed = subreddit_name_prefixed;
                }

//                public Object getApproved_by() {
//                    return approved_by;
//                }
//
//                public void setApproved_by(Object approved_by) {
//                    this.approved_by = approved_by;
//                }
//
//                public int getControversiality() {
//                    return controversiality;
//                }
//
//                public void setControversiality(int controversiality) {
//                    this.controversiality = controversiality;
//                }

                public String getBody() {
                    return body;
                }

                public void setBody(String body) {
                    this.body = body;
                }

//                public boolean isEdited() {
//                    return edited;
//                }
//
//                public void setEdited(boolean edited) {
//                    this.edited = edited;
//                }
//
//                public String getAuthor_flair_css_class() {
//                    return author_flair_css_class;
//                }
//
//                public void setAuthor_flair_css_class(String author_flair_css_class) {
//                    this.author_flair_css_class = author_flair_css_class;
//                }
//
//                public int getDowns() {
//                    return downs;
//                }
//
//                public void setDowns(int downs) {
//                    this.downs = downs;
//                }

                public String getBody_html() {
                    return body_html;
                }

                public void setBody_html(String body_html) {
                    this.body_html = body_html;
                }

//                public boolean isStickied() {
//                    return stickied;
//                }
//
//                public void setStickied(boolean stickied) {
//                    this.stickied = stickied;
//                }
//
//                public boolean isCan_gild() {
//                    return can_gild;
//                }
//
//                public void setCan_gild(boolean can_gild) {
//                    this.can_gild = can_gild;
//                }

                public String getSubreddit() {
                    return subreddit;
                }

                public void setSubreddit(String subreddit) {
                    this.subreddit = subreddit;
                }

//                public boolean isScore_hidden() {
//                    return score_hidden;
//                }
//
//                public void setScore_hidden(boolean score_hidden) {
//                    this.score_hidden = score_hidden;
//                }

                public String getSubreddit_type() {
                    return subreddit_type;
                }

                public void setSubreddit_type(String subreddit_type) {
                    this.subreddit_type = subreddit_type;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

//                public double getCreated() {
//                    return created;
//                }
//
//                public void setCreated(double created) {
//                    this.created = created;
//                }
//
//                public String getAuthor_flair_text() {
//                    return author_flair_text;
//                }
//
//                public void setAuthor_flair_text(String author_flair_text) {
//                    this.author_flair_text = author_flair_text;
//                }

                public String getCreated_utc() {
                    return created_utc;
                }

                public void setCreated_utc(String created_utc) {
                    this.created_utc = created_utc;
                }

//                public int getUps() {
//                    return ups;
//                }
//
//                public void setUps(int ups) {
//                    this.ups = ups;
//                }
//
//                public int getDepth() {
//                    return depth;
//                }
//
//                public void setDepth(int depth) {
//                    this.depth = depth;
//                }

                public Object getNum_reports() {
                    return num_reports;
                }

                public void setNum_reports(Object num_reports) {
                    this.num_reports = num_reports;
                }

//                public Object getDistinguished() {
//                    return distinguished;
//                }
//
//                public void setDistinguished(Object distinguished) {
//                    this.distinguished = distinguished;
//                }
//
//                public List<?> getUser_reports() {
//                    return user_reports;
//                }
//
//                public void setUser_reports(List<?> user_reports) {
//                    this.user_reports = user_reports;
//                }
//
//                public List<?> getMod_reports() {
//                    return mod_reports;
//                }
//
//                public void setMod_reports(List<?> mod_reports) {
//                    this.mod_reports = mod_reports;
//                }

                public static class RepliesBeanX {
                    /**
                     * kind : Listing
                     * data : {"modhash":"","children":[{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":{"kind":"Listing","data":{"modhash":"","children":[{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgr2x0s","gilded":0,"archived":false,"score":-1,"report_reasons":null,"author":"kickerofbottoms","parent_id":"t1_dgqrcir","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":1,"body":"I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgr2x0s","created":1.493192623E9,"author_flair_text":null,"created_utc":1.493163823E9,"ups":-1,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}}],"after":null,"before":null}},"user_reports":[],"saved":false,"id":"dgqrcir","gilded":0,"archived":false,"score":19,"report_reasons":null,"author":"Gratlofatic","parent_id":"t1_dgqex9k","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":0,"body":"What a distance we've come with phone cameras, wow","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;What a distance we&amp;#39;ve come with phone cameras, wow&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgqrcir","created":1.493178852E9,"author_flair_text":null,"created_utc":1.493150052E9,"ups":19,"depth":1,"mod_reports":[],"num_reports":null,"distinguished":null}},{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":{"kind":"Listing","data":{"modhash":"","children":[{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgrl5hh","gilded":0,"archived":false,"score":3,"report_reasons":null,"author":"mostlikelynotarobot","parent_id":"t1_dgrajz8","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":0,"body":"He used a 6P as well.","edited":false,"author_flair_css_class":"userGray","downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;He used a 6P as well.&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgrl5hh","created":1.49322054E9,"author_flair_text":"Samsung Galaxy S6 (Sprint), Marshmallow 6.0.1","created_utc":1.49319174E9,"ups":3,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}}],"after":null,"before":null}},"user_reports":[],"saved":false,"id":"dgrajz8","gilded":0,"archived":false,"score":1,"report_reasons":null,"author":"qdhcjv","parent_id":"t1_dgqex9k","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":0,"body":"Interesting that the album was created before the Pixel was launched. Must have been working on this for a while. ","edited":false,"author_flair_css_class":"userBlack","downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;Interesting that the album was created before the Pixel was launched. Must have been working on this for a while. &lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgrajz8","created":1.493202477E9,"author_flair_text":"Pixel // Fi // Moto 360 v2","created_utc":1.493173677E9,"ups":1,"depth":1,"mod_reports":[],"num_reports":null,"distinguished":null}}],"after":null,"before":null}
                     */

                    private String kind;
                    private DataBeanXXX data;

                    public String getKind() {
                        return kind;
                    }

                    public void setKind(String kind) {
                        this.kind = kind;
                    }

                    public DataBeanXXX getData() {
                        return data;
                    }

                    public void setData(DataBeanXXX data) {
                        this.data = data;
                    }

                    public static class DataBeanXXX {
                        /**
                         * modhash :
                         * children : [{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":{"kind":"Listing","data":{"modhash":"","children":[{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgr2x0s","gilded":0,"archived":false,"score":-1,"report_reasons":null,"author":"kickerofbottoms","parent_id":"t1_dgqrcir","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":1,"body":"I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgr2x0s","created":1.493192623E9,"author_flair_text":null,"created_utc":1.493163823E9,"ups":-1,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}}],"after":null,"before":null}},"user_reports":[],"saved":false,"id":"dgqrcir","gilded":0,"archived":false,"score":19,"report_reasons":null,"author":"Gratlofatic","parent_id":"t1_dgqex9k","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":0,"body":"What a distance we've come with phone cameras, wow","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;What a distance we&amp;#39;ve come with phone cameras, wow&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgqrcir","created":1.493178852E9,"author_flair_text":null,"created_utc":1.493150052E9,"ups":19,"depth":1,"mod_reports":[],"num_reports":null,"distinguished":null}},{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":{"kind":"Listing","data":{"modhash":"","children":[{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgrl5hh","gilded":0,"archived":false,"score":3,"report_reasons":null,"author":"mostlikelynotarobot","parent_id":"t1_dgrajz8","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":0,"body":"He used a 6P as well.","edited":false,"author_flair_css_class":"userGray","downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;He used a 6P as well.&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgrl5hh","created":1.49322054E9,"author_flair_text":"Samsung Galaxy S6 (Sprint), Marshmallow 6.0.1","created_utc":1.49319174E9,"ups":3,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}}],"after":null,"before":null}},"user_reports":[],"saved":false,"id":"dgrajz8","gilded":0,"archived":false,"score":1,"report_reasons":null,"author":"qdhcjv","parent_id":"t1_dgqex9k","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":0,"body":"Interesting that the album was created before the Pixel was launched. Must have been working on this for a while. ","edited":false,"author_flair_css_class":"userBlack","downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;Interesting that the album was created before the Pixel was launched. Must have been working on this for a while. &lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgrajz8","created":1.493202477E9,"author_flair_text":"Pixel // Fi // Moto 360 v2","created_utc":1.493173677E9,"ups":1,"depth":1,"mod_reports":[],"num_reports":null,"distinguished":null}}]
                         * after : null
                         * before : null
                         */

                        private String modhash;
                        private Object after;
                        private Object before;
                        private List<ChildrenBeanX> children;

                        public String getModhash() {
                            return modhash;
                        }

                        public void setModhash(String modhash) {
                            this.modhash = modhash;
                        }

                        public Object getAfter() {
                            return after;
                        }

                        public void setAfter(Object after) {
                            this.after = after;
                        }

                        public Object getBefore() {
                            return before;
                        }

                        public void setBefore(Object before) {
                            this.before = before;
                        }

                        public List<ChildrenBeanX> getChildren() {
                            return children;
                        }

                        public void setChildren(List<ChildrenBeanX> children) {
                            this.children = children;
                        }

                        public static class ChildrenBeanX {
                            /**
                             * kind : t1
                             * data : {"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":{"kind":"Listing","data":{"modhash":"","children":[{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgr2x0s","gilded":0,"archived":false,"score":-1,"report_reasons":null,"author":"kickerofbottoms","parent_id":"t1_dgqrcir","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":1,"body":"I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgr2x0s","created":1.493192623E9,"author_flair_text":null,"created_utc":1.493163823E9,"ups":-1,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}}],"after":null,"before":null}},"user_reports":[],"saved":false,"id":"dgqrcir","gilded":0,"archived":false,"score":19,"report_reasons":null,"author":"Gratlofatic","parent_id":"t1_dgqex9k","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":0,"body":"What a distance we've come with phone cameras, wow","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;What a distance we&amp;#39;ve come with phone cameras, wow&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgqrcir","created":1.493178852E9,"author_flair_text":null,"created_utc":1.493150052E9,"ups":19,"depth":1,"mod_reports":[],"num_reports":null,"distinguished":null}
                             */

                            private String kind;
                            private DataBeanXX data;

                            public String getKind() {
                                return kind;
                            }

                            public void setKind(String kind) {
                                this.kind = kind;
                            }

                            public DataBeanXX getData() {
                                return data;
                            }

                            public void setData(DataBeanXX data) {
                                this.data = data;
                            }

                            public static class DataBeanXX {
                                /**
                                 * subreddit_id : t5_2qlqh
                                 * banned_by : null
                                 * removal_reason : null
                                 * link_id : t3_67hja4
                                 * likes : null
                                 * replies : {"kind":"Listing","data":{"modhash":"","children":[{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgr2x0s","gilded":0,"archived":false,"score":-1,"report_reasons":null,"author":"kickerofbottoms","parent_id":"t1_dgqrcir","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":1,"body":"I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgr2x0s","created":1.493192623E9,"author_flair_text":null,"created_utc":1.493163823E9,"ups":-1,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}}],"after":null,"before":null}}
                                 * user_reports : []
                                 * saved : false
                                 * id : dgqrcir
                                 * gilded : 0
                                 * archived : false
                                 * score : 19
                                 * report_reasons : null
                                 * author : Gratlofatic
                                 * parent_id : t1_dgqex9k
                                 * subreddit_name_prefixed : r/Android
                                 * approved_by : null
                                 * controversiality : 0
                                 * body : What a distance we've come with phone cameras, wow
                                 * edited : false
                                 * author_flair_css_class : null
                                 * downs : 0
                                 * body_html : &lt;div class="md"&gt;&lt;p&gt;What a distance we&amp;#39;ve come with phone cameras, wow&lt;/p&gt;
                                 &lt;/div&gt;
                                 * stickied : false
                                 * can_gild : true
                                 * subreddit : Android
                                 * score_hidden : false
                                 * subreddit_type : public
                                 * name : t1_dgqrcir
                                 * created : 1.493178852E9
                                 * author_flair_text : null
                                 * created_utc : 1.493150052E9
                                 * ups : 19
                                 * depth : 1
                                 * mod_reports : []
                                 * num_reports : null
                                 * distinguished : null
                                 */

                                private String subreddit_id;
                                private Object banned_by;
                                private Object removal_reason;
                                private String link_id;
                                private Object likes;
                                private RepliesBean replies;
                                private boolean saved;
                                private String id;
                                private int gilded;
                                private boolean archived;
                                private int score;
                                private Object report_reasons;
                                private String author;
                                private String parent_id;
                                private String subreddit_name_prefixed;
                                private Object approved_by;
                                private int controversiality;
                                private String body;
                                private boolean edited;
                                private Object author_flair_css_class;
                                private int downs;
                                private String body_html;
                                private boolean stickied;
                                private boolean can_gild;
                                private String subreddit;
                                private boolean score_hidden;
                                private String subreddit_type;
                                private String name;
                                private double created;
                                private Object author_flair_text;
                                private double created_utc;
                                private int ups;
                                private int depth;
                                private Object num_reports;
                                private Object distinguished;
                                private List<?> user_reports;
                                private List<?> mod_reports;

                                public String getSubreddit_id() {
                                    return subreddit_id;
                                }

                                public void setSubreddit_id(String subreddit_id) {
                                    this.subreddit_id = subreddit_id;
                                }

                                public Object getBanned_by() {
                                    return banned_by;
                                }

                                public void setBanned_by(Object banned_by) {
                                    this.banned_by = banned_by;
                                }

                                public Object getRemoval_reason() {
                                    return removal_reason;
                                }

                                public void setRemoval_reason(Object removal_reason) {
                                    this.removal_reason = removal_reason;
                                }

                                public String getLink_id() {
                                    return link_id;
                                }

                                public void setLink_id(String link_id) {
                                    this.link_id = link_id;
                                }

                                public Object getLikes() {
                                    return likes;
                                }

                                public void setLikes(Object likes) {
                                    this.likes = likes;
                                }

                                public RepliesBean getReplies() {
                                    return replies;
                                }

                                public void setReplies(RepliesBean replies) {
                                    this.replies = replies;
                                }

                                public boolean isSaved() {
                                    return saved;
                                }

                                public void setSaved(boolean saved) {
                                    this.saved = saved;
                                }

                                public String getId() {
                                    return id;
                                }

                                public void setId(String id) {
                                    this.id = id;
                                }

                                public int getGilded() {
                                    return gilded;
                                }

                                public void setGilded(int gilded) {
                                    this.gilded = gilded;
                                }

                                public boolean isArchived() {
                                    return archived;
                                }

                                public void setArchived(boolean archived) {
                                    this.archived = archived;
                                }

                                public int getScore() {
                                    return score;
                                }

                                public void setScore(int score) {
                                    this.score = score;
                                }

                                public Object getReport_reasons() {
                                    return report_reasons;
                                }

                                public void setReport_reasons(Object report_reasons) {
                                    this.report_reasons = report_reasons;
                                }

                                public String getAuthor() {
                                    return author;
                                }

                                public void setAuthor(String author) {
                                    this.author = author;
                                }

                                public String getParent_id() {
                                    return parent_id;
                                }

                                public void setParent_id(String parent_id) {
                                    this.parent_id = parent_id;
                                }

                                public String getSubreddit_name_prefixed() {
                                    return subreddit_name_prefixed;
                                }

                                public void setSubreddit_name_prefixed(String subreddit_name_prefixed) {
                                    this.subreddit_name_prefixed = subreddit_name_prefixed;
                                }

                                public Object getApproved_by() {
                                    return approved_by;
                                }

                                public void setApproved_by(Object approved_by) {
                                    this.approved_by = approved_by;
                                }

                                public int getControversiality() {
                                    return controversiality;
                                }

                                public void setControversiality(int controversiality) {
                                    this.controversiality = controversiality;
                                }

                                public String getBody() {
                                    return body;
                                }

                                public void setBody(String body) {
                                    this.body = body;
                                }

                                public boolean isEdited() {
                                    return edited;
                                }

                                public void setEdited(boolean edited) {
                                    this.edited = edited;
                                }

                                public Object getAuthor_flair_css_class() {
                                    return author_flair_css_class;
                                }

                                public void setAuthor_flair_css_class(Object author_flair_css_class) {
                                    this.author_flair_css_class = author_flair_css_class;
                                }

                                public int getDowns() {
                                    return downs;
                                }

                                public void setDowns(int downs) {
                                    this.downs = downs;
                                }

                                public String getBody_html() {
                                    return body_html;
                                }

                                public void setBody_html(String body_html) {
                                    this.body_html = body_html;
                                }

                                public boolean isStickied() {
                                    return stickied;
                                }

                                public void setStickied(boolean stickied) {
                                    this.stickied = stickied;
                                }

                                public boolean isCan_gild() {
                                    return can_gild;
                                }

                                public void setCan_gild(boolean can_gild) {
                                    this.can_gild = can_gild;
                                }

                                public String getSubreddit() {
                                    return subreddit;
                                }

                                public void setSubreddit(String subreddit) {
                                    this.subreddit = subreddit;
                                }

                                public boolean isScore_hidden() {
                                    return score_hidden;
                                }

                                public void setScore_hidden(boolean score_hidden) {
                                    this.score_hidden = score_hidden;
                                }

                                public String getSubreddit_type() {
                                    return subreddit_type;
                                }

                                public void setSubreddit_type(String subreddit_type) {
                                    this.subreddit_type = subreddit_type;
                                }

                                public String getName() {
                                    return name;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public double getCreated() {
                                    return created;
                                }

                                public void setCreated(double created) {
                                    this.created = created;
                                }

                                public Object getAuthor_flair_text() {
                                    return author_flair_text;
                                }

                                public void setAuthor_flair_text(Object author_flair_text) {
                                    this.author_flair_text = author_flair_text;
                                }

                                public double getCreated_utc() {
                                    return created_utc;
                                }

                                public void setCreated_utc(double created_utc) {
                                    this.created_utc = created_utc;
                                }

                                public int getUps() {
                                    return ups;
                                }

                                public void setUps(int ups) {
                                    this.ups = ups;
                                }

                                public int getDepth() {
                                    return depth;
                                }

                                public void setDepth(int depth) {
                                    this.depth = depth;
                                }

                                public Object getNum_reports() {
                                    return num_reports;
                                }

                                public void setNum_reports(Object num_reports) {
                                    this.num_reports = num_reports;
                                }

                                public Object getDistinguished() {
                                    return distinguished;
                                }

                                public void setDistinguished(Object distinguished) {
                                    this.distinguished = distinguished;
                                }

                                public List<?> getUser_reports() {
                                    return user_reports;
                                }

                                public void setUser_reports(List<?> user_reports) {
                                    this.user_reports = user_reports;
                                }

                                public List<?> getMod_reports() {
                                    return mod_reports;
                                }

                                public void setMod_reports(List<?> mod_reports) {
                                    this.mod_reports = mod_reports;
                                }

                                public static class RepliesBean {
                                    /**
                                     * kind : Listing
                                     * data : {"modhash":"","children":[{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgr2x0s","gilded":0,"archived":false,"score":-1,"report_reasons":null,"author":"kickerofbottoms","parent_id":"t1_dgqrcir","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":1,"body":"I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgr2x0s","created":1.493192623E9,"author_flair_text":null,"created_utc":1.493163823E9,"ups":-1,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}}],"after":null,"before":null}
                                     */

                                    private String kind;
                                    private DataBeanX data;

                                    public String getKind() {
                                        return kind;
                                    }

                                    public void setKind(String kind) {
                                        this.kind = kind;
                                    }

                                    public DataBeanX getData() {
                                        return data;
                                    }

                                    public void setData(DataBeanX data) {
                                        this.data = data;
                                    }

                                    public static class DataBeanX {
                                        /**
                                         * modhash :
                                         * children : [{"kind":"t1","data":{"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgr2x0s","gilded":0,"archived":false,"score":-1,"report_reasons":null,"author":"kickerofbottoms","parent_id":"t1_dgqrcir","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":1,"body":"I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgr2x0s","created":1.493192623E9,"author_flair_text":null,"created_utc":1.493163823E9,"ups":-1,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}}]
                                         * after : null
                                         * before : null
                                         */

                                        private String modhash;
                                        private Object after;
                                        private Object before;
                                        private List<ChildrenBean> children;

                                        public String getModhash() {
                                            return modhash;
                                        }

                                        public void setModhash(String modhash) {
                                            this.modhash = modhash;
                                        }

                                        public Object getAfter() {
                                            return after;
                                        }

                                        public void setAfter(Object after) {
                                            this.after = after;
                                        }

                                        public Object getBefore() {
                                            return before;
                                        }

                                        public void setBefore(Object before) {
                                            this.before = before;
                                        }

                                        public List<ChildrenBean> getChildren() {
                                            return children;
                                        }

                                        public void setChildren(List<ChildrenBean> children) {
                                            this.children = children;
                                        }

                                        public static class ChildrenBean {
                                            /**
                                             * kind : t1
                                             * data : {"subreddit_id":"t5_2qlqh","banned_by":null,"removal_reason":null,"link_id":"t3_67hja4","likes":null,"replies":"","user_reports":[],"saved":false,"id":"dgr2x0s","gilded":0,"archived":false,"score":-1,"report_reasons":null,"author":"kickerofbottoms","parent_id":"t1_dgqrcir","subreddit_name_prefixed":"r/Android","approved_by":null,"controversiality":1,"body":"I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop","edited":false,"author_flair_css_class":null,"downs":0,"body_html":"&lt;div class=\"md\"&gt;&lt;p&gt;I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop&lt;/p&gt;\n&lt;/div&gt;","stickied":false,"can_gild":true,"subreddit":"Android","score_hidden":false,"subreddit_type":"public","name":"t1_dgr2x0s","created":1.493192623E9,"author_flair_text":null,"created_utc":1.493163823E9,"ups":-1,"depth":2,"mod_reports":[],"num_reports":null,"distinguished":null}
                                             */

                                            private String kind;
                                            private DataBean data;

                                            public String getKind() {
                                                return kind;
                                            }

                                            public void setKind(String kind) {
                                                this.kind = kind;
                                            }

                                            public DataBean getData() {
                                                return data;
                                            }

                                            public void setData(DataBean data) {
                                                this.data = data;
                                            }

                                            public static class DataBean {
                                                /**
                                                 * subreddit_id : t5_2qlqh
                                                 * banned_by : null
                                                 * removal_reason : null
                                                 * link_id : t3_67hja4
                                                 * likes : null
                                                 * replies :
                                                 * user_reports : []
                                                 * saved : false
                                                 * id : dgr2x0s
                                                 * gilded : 0
                                                 * archived : false
                                                 * score : -1
                                                 * report_reasons : null
                                                 * author : kickerofbottoms
                                                 * parent_id : t1_dgqrcir
                                                 * subreddit_name_prefixed : r/Android
                                                 * approved_by : null
                                                 * controversiality : 1
                                                 * body : I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop
                                                 * edited : false
                                                 * author_flair_css_class : null
                                                 * downs : 0
                                                 * body_html : &lt;div class="md"&gt;&lt;p&gt;I mean, you could probably coax a respectable shot out of a flip phone of you stacked everything in Photoshop&lt;/p&gt;
                                                 &lt;/div&gt;
                                                 * stickied : false
                                                 * can_gild : true
                                                 * subreddit : Android
                                                 * score_hidden : false
                                                 * subreddit_type : public
                                                 * name : t1_dgr2x0s
                                                 * created : 1.493192623E9
                                                 * author_flair_text : null
                                                 * created_utc : 1.493163823E9
                                                 * ups : -1
                                                 * depth : 2
                                                 * mod_reports : []
                                                 * num_reports : null
                                                 * distinguished : null
                                                 */

                                                private String subreddit_id;
                                                private Object banned_by;
                                                private Object removal_reason;
                                                private String link_id;
                                                private Object likes;
                                                private String replies;
                                                private boolean saved;
                                                private String id;
                                                private int gilded;
                                                private boolean archived;
                                                private int score;
                                                private Object report_reasons;
                                                private String author;
                                                private String parent_id;
                                                private String subreddit_name_prefixed;
                                                private Object approved_by;
                                                private int controversiality;
                                                private String body;
                                                private boolean edited;
                                                private Object author_flair_css_class;
                                                private int downs;
                                                private String body_html;
                                                private boolean stickied;
                                                private boolean can_gild;
                                                private String subreddit;
                                                private boolean score_hidden;
                                                private String subreddit_type;
                                                private String name;
                                                private double created;
                                                private Object author_flair_text;
                                                private double created_utc;
                                                private int ups;
                                                private int depth;
                                                private Object num_reports;
                                                private Object distinguished;
                                                private List<?> user_reports;
                                                private List<?> mod_reports;

                                                public String getSubreddit_id() {
                                                    return subreddit_id;
                                                }

                                                public void setSubreddit_id(String subreddit_id) {
                                                    this.subreddit_id = subreddit_id;
                                                }

                                                public Object getBanned_by() {
                                                    return banned_by;
                                                }

                                                public void setBanned_by(Object banned_by) {
                                                    this.banned_by = banned_by;
                                                }

                                                public Object getRemoval_reason() {
                                                    return removal_reason;
                                                }

                                                public void setRemoval_reason(Object removal_reason) {
                                                    this.removal_reason = removal_reason;
                                                }

                                                public String getLink_id() {
                                                    return link_id;
                                                }

                                                public void setLink_id(String link_id) {
                                                    this.link_id = link_id;
                                                }

                                                public Object getLikes() {
                                                    return likes;
                                                }

                                                public void setLikes(Object likes) {
                                                    this.likes = likes;
                                                }

                                                public String getReplies() {
                                                    return replies;
                                                }

                                                public void setReplies(String replies) {
                                                    this.replies = replies;
                                                }

                                                public boolean isSaved() {
                                                    return saved;
                                                }

                                                public void setSaved(boolean saved) {
                                                    this.saved = saved;
                                                }

                                                public String getId() {
                                                    return id;
                                                }

                                                public void setId(String id) {
                                                    this.id = id;
                                                }

                                                public int getGilded() {
                                                    return gilded;
                                                }

                                                public void setGilded(int gilded) {
                                                    this.gilded = gilded;
                                                }

                                                public boolean isArchived() {
                                                    return archived;
                                                }

                                                public void setArchived(boolean archived) {
                                                    this.archived = archived;
                                                }

                                                public int getScore() {
                                                    return score;
                                                }

                                                public void setScore(int score) {
                                                    this.score = score;
                                                }

                                                public Object getReport_reasons() {
                                                    return report_reasons;
                                                }

                                                public void setReport_reasons(Object report_reasons) {
                                                    this.report_reasons = report_reasons;
                                                }

                                                public String getAuthor() {
                                                    return author;
                                                }

                                                public void setAuthor(String author) {
                                                    this.author = author;
                                                }

                                                public String getParent_id() {
                                                    return parent_id;
                                                }

                                                public void setParent_id(String parent_id) {
                                                    this.parent_id = parent_id;
                                                }

                                                public String getSubreddit_name_prefixed() {
                                                    return subreddit_name_prefixed;
                                                }

                                                public void setSubreddit_name_prefixed(String subreddit_name_prefixed) {
                                                    this.subreddit_name_prefixed = subreddit_name_prefixed;
                                                }

                                                public Object getApproved_by() {
                                                    return approved_by;
                                                }

                                                public void setApproved_by(Object approved_by) {
                                                    this.approved_by = approved_by;
                                                }

                                                public int getControversiality() {
                                                    return controversiality;
                                                }

                                                public void setControversiality(int controversiality) {
                                                    this.controversiality = controversiality;
                                                }

                                                public String getBody() {
                                                    return body;
                                                }

                                                public void setBody(String body) {
                                                    this.body = body;
                                                }

                                                public boolean isEdited() {
                                                    return edited;
                                                }

                                                public void setEdited(boolean edited) {
                                                    this.edited = edited;
                                                }

                                                public Object getAuthor_flair_css_class() {
                                                    return author_flair_css_class;
                                                }

                                                public void setAuthor_flair_css_class(Object author_flair_css_class) {
                                                    this.author_flair_css_class = author_flair_css_class;
                                                }

                                                public int getDowns() {
                                                    return downs;
                                                }

                                                public void setDowns(int downs) {
                                                    this.downs = downs;
                                                }

                                                public String getBody_html() {
                                                    return body_html;
                                                }

                                                public void setBody_html(String body_html) {
                                                    this.body_html = body_html;
                                                }

                                                public boolean isStickied() {
                                                    return stickied;
                                                }

                                                public void setStickied(boolean stickied) {
                                                    this.stickied = stickied;
                                                }

                                                public boolean isCan_gild() {
                                                    return can_gild;
                                                }

                                                public void setCan_gild(boolean can_gild) {
                                                    this.can_gild = can_gild;
                                                }

                                                public String getSubreddit() {
                                                    return subreddit;
                                                }

                                                public void setSubreddit(String subreddit) {
                                                    this.subreddit = subreddit;
                                                }

                                                public boolean isScore_hidden() {
                                                    return score_hidden;
                                                }

                                                public void setScore_hidden(boolean score_hidden) {
                                                    this.score_hidden = score_hidden;
                                                }

                                                public String getSubreddit_type() {
                                                    return subreddit_type;
                                                }

                                                public void setSubreddit_type(String subreddit_type) {
                                                    this.subreddit_type = subreddit_type;
                                                }

                                                public String getName() {
                                                    return name;
                                                }

                                                public void setName(String name) {
                                                    this.name = name;
                                                }

                                                public double getCreated() {
                                                    return created;
                                                }

                                                public void setCreated(double created) {
                                                    this.created = created;
                                                }

                                                public Object getAuthor_flair_text() {
                                                    return author_flair_text;
                                                }

                                                public void setAuthor_flair_text(Object author_flair_text) {
                                                    this.author_flair_text = author_flair_text;
                                                }

                                                public double getCreated_utc() {
                                                    return created_utc;
                                                }

                                                public void setCreated_utc(double created_utc) {
                                                    this.created_utc = created_utc;
                                                }

                                                public int getUps() {
                                                    return ups;
                                                }

                                                public void setUps(int ups) {
                                                    this.ups = ups;
                                                }

                                                public int getDepth() {
                                                    return depth;
                                                }

                                                public void setDepth(int depth) {
                                                    this.depth = depth;
                                                }

                                                public Object getNum_reports() {
                                                    return num_reports;
                                                }

                                                public void setNum_reports(Object num_reports) {
                                                    this.num_reports = num_reports;
                                                }

                                                public Object getDistinguished() {
                                                    return distinguished;
                                                }

                                                public void setDistinguished(Object distinguished) {
                                                    this.distinguished = distinguished;
                                                }

                                                public List<?> getUser_reports() {
                                                    return user_reports;
                                                }

                                                public void setUser_reports(List<?> user_reports) {
                                                    this.user_reports = user_reports;
                                                }

                                                public List<?> getMod_reports() {
                                                    return mod_reports;
                                                }

                                                public void setMod_reports(List<?> mod_reports) {
                                                    this.mod_reports = mod_reports;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}