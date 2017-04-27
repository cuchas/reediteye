package com.example.eduardocucharro.reediteye.reedit;

import java.util.List;

/**
 * Created by eduardocucharro on 25/04/17.
 */

public class FeedResponse {

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
        private String modhash;
        private String after;
        private Object before;
        private List<ChildrenBean> children;

        public String getModhash() {
            return modhash;
        }

        public void setModhash(String modhash) {
            this.modhash = modhash;
        }

        public String getAfter() {
            return after;
        }

        public void setAfter(String after) {
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
                private boolean contest_mode;
                private Object banned_by;
                private MediaEmbedBean media_embed;
                private String subreddit;
                private Object selftext_html;
                private String selftext;
                private Object likes;
                private Object suggested_sort;
                private SecureMediaBean secure_media;
                private Object link_flair_text;
                private String id;
                private int gilded;
                private SecureMediaEmbedBean secure_media_embed;
                private boolean clicked;
                private int score;
                private Object report_reasons;
                private String author;
                private boolean saved;
                private String name;
                private String subreddit_name_prefixed;
                private Object approved_by;
                private boolean over_18;
                private String domain;
                private boolean hidden;
                private PreviewBean preview;
                private String thumbnail;
                private String subreddit_id;
//                private int edited;
                private Object link_flair_css_class;
                private String author_flair_css_class;
                private int downs;
                private boolean brand_safe;
                private boolean archived;
                private Object removal_reason;
                private String post_hint;
                private boolean is_self;
                private boolean hide_score;
                private boolean spoiler;
                private String permalink;
                private Object num_reports;
                private boolean locked;
                private boolean stickied;
                private double created;
                private String url;
                private String author_flair_text;
                private boolean quarantine;
                private String title;
                private String created_utc;
                private Object distinguished;
                private MediaBean media;
                private int num_comments;
                private boolean visited;
                private String subreddit_type;
                private int ups;
                private List<?> user_reports;
                private List<?> mod_reports;

                public boolean isContest_mode() {
                    return contest_mode;
                }

                public void setContest_mode(boolean contest_mode) {
                    this.contest_mode = contest_mode;
                }

                public Object getBanned_by() {
                    return banned_by;
                }

                public void setBanned_by(Object banned_by) {
                    this.banned_by = banned_by;
                }

                public MediaEmbedBean getMedia_embed() {
                    return media_embed;
                }

                public void setMedia_embed(MediaEmbedBean media_embed) {
                    this.media_embed = media_embed;
                }

                public String getSubreddit() {
                    return subreddit;
                }

                public void setSubreddit(String subreddit) {
                    this.subreddit = subreddit;
                }

                public Object getSelftext_html() {
                    return selftext_html;
                }

                public void setSelftext_html(Object selftext_html) {
                    this.selftext_html = selftext_html;
                }

                public String getSelftext() {
                    return selftext;
                }

                public void setSelftext(String selftext) {
                    this.selftext = selftext;
                }

                public Object getLikes() {
                    return likes;
                }

                public void setLikes(Object likes) {
                    this.likes = likes;
                }

                public Object getSuggested_sort() {
                    return suggested_sort;
                }

                public void setSuggested_sort(Object suggested_sort) {
                    this.suggested_sort = suggested_sort;
                }

                public SecureMediaBean getSecure_media() {
                    return secure_media;
                }

                public void setSecure_media(SecureMediaBean secure_media) {
                    this.secure_media = secure_media;
                }

                public Object getLink_flair_text() {
                    return link_flair_text;
                }

                public void setLink_flair_text(Object link_flair_text) {
                    this.link_flair_text = link_flair_text;
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

                public SecureMediaEmbedBean getSecure_media_embed() {
                    return secure_media_embed;
                }

                public void setSecure_media_embed(SecureMediaEmbedBean secure_media_embed) {
                    this.secure_media_embed = secure_media_embed;
                }

                public boolean isClicked() {
                    return clicked;
                }

                public void setClicked(boolean clicked) {
                    this.clicked = clicked;
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

                public boolean isSaved() {
                    return saved;
                }

                public void setSaved(boolean saved) {
                    this.saved = saved;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
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

                public boolean isOver_18() {
                    return over_18;
                }

                public void setOver_18(boolean over_18) {
                    this.over_18 = over_18;
                }

                public String getDomain() {
                    return domain;
                }

                public void setDomain(String domain) {
                    this.domain = domain;
                }

                public boolean isHidden() {
                    return hidden;
                }

                public void setHidden(boolean hidden) {
                    this.hidden = hidden;
                }

                public PreviewBean getPreview() {
                    return preview;
                }

                public void setPreview(PreviewBean preview) {
                    this.preview = preview;
                }

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public String getSubreddit_id() {
                    return subreddit_id;
                }

                public void setSubreddit_id(String subreddit_id) {
                    this.subreddit_id = subreddit_id;
                }

//                public int isEdited() {
//                    return edited;
//                }
//
//                public void setEdited(int edited) {
//                    this.edited = edited;
//                }

                public Object getLink_flair_css_class() {
                    return link_flair_css_class;
                }

                public void setLink_flair_css_class(Object link_flair_css_class) {
                    this.link_flair_css_class = link_flair_css_class;
                }

                public String getAuthor_flair_css_class() {
                    return author_flair_css_class;
                }

                public void setAuthor_flair_css_class(String author_flair_css_class) {
                    this.author_flair_css_class = author_flair_css_class;
                }

                public int getDowns() {
                    return downs;
                }

                public void setDowns(int downs) {
                    this.downs = downs;
                }

                public boolean isBrand_safe() {
                    return brand_safe;
                }

                public void setBrand_safe(boolean brand_safe) {
                    this.brand_safe = brand_safe;
                }

                public boolean isArchived() {
                    return archived;
                }

                public void setArchived(boolean archived) {
                    this.archived = archived;
                }

                public Object getRemoval_reason() {
                    return removal_reason;
                }

                public void setRemoval_reason(Object removal_reason) {
                    this.removal_reason = removal_reason;
                }

                public String getPost_hint() {
                    return post_hint;
                }

                public void setPost_hint(String post_hint) {
                    this.post_hint = post_hint;
                }

                public boolean isIs_self() {
                    return is_self;
                }

                public void setIs_self(boolean is_self) {
                    this.is_self = is_self;
                }

                public boolean isHide_score() {
                    return hide_score;
                }

                public void setHide_score(boolean hide_score) {
                    this.hide_score = hide_score;
                }

                public boolean isSpoiler() {
                    return spoiler;
                }

                public void setSpoiler(boolean spoiler) {
                    this.spoiler = spoiler;
                }

                public String getPermalink() {
                    return permalink;
                }

                public void setPermalink(String permalink) {
                    this.permalink = permalink;
                }

                public Object getNum_reports() {
                    return num_reports;
                }

                public void setNum_reports(Object num_reports) {
                    this.num_reports = num_reports;
                }

                public boolean isLocked() {
                    return locked;
                }

                public void setLocked(boolean locked) {
                    this.locked = locked;
                }

                public boolean isStickied() {
                    return stickied;
                }

                public void setStickied(boolean stickied) {
                    this.stickied = stickied;
                }

                public double getCreated() {
                    return created;
                }

                public void setCreated(double created) {
                    this.created = created;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getAuthor_flair_text() {
                    return author_flair_text;
                }

                public void setAuthor_flair_text(String author_flair_text) {
                    this.author_flair_text = author_flair_text;
                }

                public boolean isQuarantine() {
                    return quarantine;
                }

                public void setQuarantine(boolean quarantine) {
                    this.quarantine = quarantine;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getCreated_utc() {
                    return created_utc;
                }

                public void setCreated_utc(String created_utc) {
                    this.created_utc = created_utc;
                }

                public Object getDistinguished() {
                    return distinguished;
                }

                public void setDistinguished(Object distinguished) {
                    this.distinguished = distinguished;
                }

                public MediaBean getMedia() {
                    return media;
                }

                public void setMedia(MediaBean media) {
                    this.media = media;
                }

                public int getNum_comments() {
                    return num_comments;
                }

                public void setNum_comments(int num_comments) {
                    this.num_comments = num_comments;
                }

                public boolean isVisited() {
                    return visited;
                }

                public void setVisited(boolean visited) {
                    this.visited = visited;
                }

                public String getSubreddit_type() {
                    return subreddit_type;
                }

                public void setSubreddit_type(String subreddit_type) {
                    this.subreddit_type = subreddit_type;
                }

                public int getUps() {
                    return ups;
                }

                public void setUps(int ups) {
                    this.ups = ups;
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

                public static class MediaEmbedBean {
                    /**
                     * content : &lt;iframe width="600" height="338" src="https://www.youtube.com/embed/nj9tR3q7nOk?feature=oembed" frameborder="0" allowfullscreen&gt;&lt;/iframe&gt;
                     * width : 600
                     * scrolling : false
                     * height : 338
                     */

                    private String content;
                    private int width;
                    private boolean scrolling;
                    private int height;

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public boolean isScrolling() {
                        return scrolling;
                    }

                    public void setScrolling(boolean scrolling) {
                        this.scrolling = scrolling;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class SecureMediaBean {
                    /**
                     * type : youtube.com
                     * oembed : {"provider_url":"https://www.youtube.com/","title":"Samsung Galaxy S8+ Review: What do you get for $850?","type":"video","html":"&lt;iframe width=\"600\" height=\"338\" src=\"https://www.youtube.com/embed/nj9tR3q7nOk?feature=oembed\" frameborder=\"0\" allowfullscreen&gt;&lt;/iframe&gt;","author_name":"Pocketnow","height":338,"width":600,"version":"1.0","thumbnail_width":480,"provider_name":"YouTube","thumbnail_url":"https://i.ytimg.com/vi/nj9tR3q7nOk/hqdefault.jpg","thumbnail_height":360,"author_url":"https://www.youtube.com/user/pocketnowvideo"}
                     */

                    private String type;
                    private OembedBean oembed;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public OembedBean getOembed() {
                        return oembed;
                    }

                    public void setOembed(OembedBean oembed) {
                        this.oembed = oembed;
                    }

                    public static class OembedBean {
                        /**
                         * provider_url : https://www.youtube.com/
                         * title : Samsung Galaxy S8+ Review: What do you get for $850?
                         * type : video
                         * html : &lt;iframe width="600" height="338" src="https://www.youtube.com/embed/nj9tR3q7nOk?feature=oembed" frameborder="0" allowfullscreen&gt;&lt;/iframe&gt;
                         * author_name : Pocketnow
                         * height : 338
                         * width : 600
                         * version : 1.0
                         * thumbnail_width : 480
                         * provider_name : YouTube
                         * thumbnail_url : https://i.ytimg.com/vi/nj9tR3q7nOk/hqdefault.jpg
                         * thumbnail_height : 360
                         * author_url : https://www.youtube.com/user/pocketnowvideo
                         */

                        private String provider_url;
                        private String title;
                        private String type;
                        private String html;
                        private String author_name;
                        private int height;
                        private int width;
                        private String version;
                        private int thumbnail_width;
                        private String provider_name;
                        private String thumbnail_url;
                        private int thumbnail_height;
                        private String author_url;

                        public String getProvider_url() {
                            return provider_url;
                        }

                        public void setProvider_url(String provider_url) {
                            this.provider_url = provider_url;
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

                        public String getHtml() {
                            return html;
                        }

                        public void setHtml(String html) {
                            this.html = html;
                        }

                        public String getAuthor_name() {
                            return author_name;
                        }

                        public void setAuthor_name(String author_name) {
                            this.author_name = author_name;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public String getVersion() {
                            return version;
                        }

                        public void setVersion(String version) {
                            this.version = version;
                        }

                        public int getThumbnail_width() {
                            return thumbnail_width;
                        }

                        public void setThumbnail_width(int thumbnail_width) {
                            this.thumbnail_width = thumbnail_width;
                        }

                        public String getProvider_name() {
                            return provider_name;
                        }

                        public void setProvider_name(String provider_name) {
                            this.provider_name = provider_name;
                        }

                        public String getThumbnail_url() {
                            return thumbnail_url;
                        }

                        public void setThumbnail_url(String thumbnail_url) {
                            this.thumbnail_url = thumbnail_url;
                        }

                        public int getThumbnail_height() {
                            return thumbnail_height;
                        }

                        public void setThumbnail_height(int thumbnail_height) {
                            this.thumbnail_height = thumbnail_height;
                        }

                        public String getAuthor_url() {
                            return author_url;
                        }

                        public void setAuthor_url(String author_url) {
                            this.author_url = author_url;
                        }
                    }
                }

                public static class SecureMediaEmbedBean {
                    /**
                     * content : &lt;iframe width="600" height="338" src="https://www.youtube.com/embed/nj9tR3q7nOk?feature=oembed" frameborder="0" allowfullscreen&gt;&lt;/iframe&gt;
                     * width : 600
                     * scrolling : false
                     * height : 338
                     */

                    private String content;
                    private int width;
                    private boolean scrolling;
                    private int height;

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public boolean isScrolling() {
                        return scrolling;
                    }

                    public void setScrolling(boolean scrolling) {
                        this.scrolling = scrolling;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class PreviewBean {
                    /**
                     * images : [{"source":{"url":"https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?s=d15754e82406c15b77223ca8dd1e7c52","width":480,"height":360},"resolutions":[{"url":"https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=108&amp;s=34d6758b56daeb01d2287aa1275106d6","width":108,"height":81},{"url":"https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=216&amp;s=8d40bc7813bab8b54c845a4d78ccd7ea","width":216,"height":162},{"url":"https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=320&amp;s=2d91f7f770e1b4b12e9109f2b44f4cba","width":320,"height":240}],"variants":{},"id":"WKwYvZKb6QDHmlIWjSdsG_b5U4O90A6MENdmskiRmUI"}]
                     * enabled : false
                     */

                    private boolean enabled;
                    private List<ImagesBean> images;

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }

                    public List<ImagesBean> getImages() {
                        return images;
                    }

                    public void setImages(List<ImagesBean> images) {
                        this.images = images;
                    }

                    public static class ImagesBean {
                        /**
                         * source : {"url":"https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?s=d15754e82406c15b77223ca8dd1e7c52","width":480,"height":360}
                         * resolutions : [{"url":"https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=108&amp;s=34d6758b56daeb01d2287aa1275106d6","width":108,"height":81},{"url":"https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=216&amp;s=8d40bc7813bab8b54c845a4d78ccd7ea","width":216,"height":162},{"url":"https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=320&amp;s=2d91f7f770e1b4b12e9109f2b44f4cba","width":320,"height":240}]
                         * variants : {}
                         * id : WKwYvZKb6QDHmlIWjSdsG_b5U4O90A6MENdmskiRmUI
                         */

                        private SourceBean source;
                        private VariantsBean variants;
                        private String id;
                        private List<ResolutionsBean> resolutions;

                        public SourceBean getSource() {
                            return source;
                        }

                        public void setSource(SourceBean source) {
                            this.source = source;
                        }

                        public VariantsBean getVariants() {
                            return variants;
                        }

                        public void setVariants(VariantsBean variants) {
                            this.variants = variants;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public List<ResolutionsBean> getResolutions() {
                            return resolutions;
                        }

                        public void setResolutions(List<ResolutionsBean> resolutions) {
                            this.resolutions = resolutions;
                        }

                        public static class SourceBean {
                            String url;
                            int width;
                            int height;

                            public String getUrl() {
                                return url;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }
                        }

                        public static class VariantsBean {
                        }

                        public static class ResolutionsBean {
                            /**
                             * url : https://i.redditmedia.com/hAbsb8SADqAnvpFFEEC7fsp22AYLZCzXu-JhSWsAnG4.jpg?fit=crop&amp;crop=faces%2Centropy&amp;arh=2&amp;w=108&amp;s=34d6758b56daeb01d2287aa1275106d6
                             * width : 108
                             * height : 81
                             */

                            private String url;
                            private int width;
                            private int height;

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public int getWidth() {
                                return width;
                            }

                            public void setWidth(int width) {
                                this.width = width;
                            }

                            public int getHeight() {
                                return height;
                            }

                            public void setHeight(int height) {
                                this.height = height;
                            }
                        }
                    }
                }

                public static class MediaBean {
                    /**
                     * type : youtube.com
                     * oembed : {"provider_url":"https://www.youtube.com/","title":"Samsung Galaxy S8+ Review: What do you get for $850?","type":"video","html":"&lt;iframe width=\"600\" height=\"338\" src=\"https://www.youtube.com/embed/nj9tR3q7nOk?feature=oembed\" frameborder=\"0\" allowfullscreen&gt;&lt;/iframe&gt;","author_name":"Pocketnow","height":338,"width":600,"version":"1.0","thumbnail_width":480,"provider_name":"YouTube","thumbnail_url":"https://i.ytimg.com/vi/nj9tR3q7nOk/hqdefault.jpg","thumbnail_height":360,"author_url":"https://www.youtube.com/user/pocketnowvideo"}
                     */

                    private String type;
                    private OembedBeanX oembed;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public OembedBeanX getOembed() {
                        return oembed;
                    }

                    public void setOembed(OembedBeanX oembed) {
                        this.oembed = oembed;
                    }

                    public static class OembedBeanX {
                        /**
                         * provider_url : https://www.youtube.com/
                         * title : Samsung Galaxy S8+ Review: What do you get for $850?
                         * type : video
                         * html : &lt;iframe width="600" height="338" src="https://www.youtube.com/embed/nj9tR3q7nOk?feature=oembed" frameborder="0" allowfullscreen&gt;&lt;/iframe&gt;
                         * author_name : Pocketnow
                         * height : 338
                         * width : 600
                         * version : 1.0
                         * thumbnail_width : 480
                         * provider_name : YouTube
                         * thumbnail_url : https://i.ytimg.com/vi/nj9tR3q7nOk/hqdefault.jpg
                         * thumbnail_height : 360
                         * author_url : https://www.youtube.com/user/pocketnowvideo
                         */

                        private String provider_url;
                        private String title;
                        private String type;
                        private String html;
                        private String author_name;
                        private int height;
                        private int width;
                        private String version;
                        private int thumbnail_width;
                        private String provider_name;
                        private String thumbnail_url;
                        private int thumbnail_height;
                        private String author_url;

                        public String getProvider_url() {
                            return provider_url;
                        }

                        public void setProvider_url(String provider_url) {
                            this.provider_url = provider_url;
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

                        public String getHtml() {
                            return html;
                        }

                        public void setHtml(String html) {
                            this.html = html;
                        }

                        public String getAuthor_name() {
                            return author_name;
                        }

                        public void setAuthor_name(String author_name) {
                            this.author_name = author_name;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public String getVersion() {
                            return version;
                        }

                        public void setVersion(String version) {
                            this.version = version;
                        }

                        public int getThumbnail_width() {
                            return thumbnail_width;
                        }

                        public void setThumbnail_width(int thumbnail_width) {
                            this.thumbnail_width = thumbnail_width;
                        }

                        public String getProvider_name() {
                            return provider_name;
                        }

                        public void setProvider_name(String provider_name) {
                            this.provider_name = provider_name;
                        }

                        public String getThumbnail_url() {
                            return thumbnail_url;
                        }

                        public void setThumbnail_url(String thumbnail_url) {
                            this.thumbnail_url = thumbnail_url;
                        }

                        public int getThumbnail_height() {
                            return thumbnail_height;
                        }

                        public void setThumbnail_height(int thumbnail_height) {
                            this.thumbnail_height = thumbnail_height;
                        }

                        public String getAuthor_url() {
                            return author_url;
                        }

                        public void setAuthor_url(String author_url) {
                            this.author_url = author_url;
                        }
                    }
                }
            }
        }
    }
}
