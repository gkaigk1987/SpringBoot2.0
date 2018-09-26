package com.gk.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_thesis
 */
public class Thesis {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   论文编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_code
     *
     * @mbg.generated
     */
    private String thesisCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_title
     *
     * @mbg.generated
     */
    private String thesisTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_author
     *
     * @mbg.generated
     */
    private String thesisAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_isbn
     *
     * @mbg.generated
     */
    private String thesisIsbn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_pages
     *
     * @mbg.generated
     */
    private String thesisPages;

    /**
     * Database Column Remarks:
     *   来源
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_source
     *
     * @mbg.generated
     */
    private String thesisSource;

    /**
     * Database Column Remarks:
     *   指导教授
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_adviser
     *
     * @mbg.generated
     */
    private String thesisAdviser;

    /**
     * Database Column Remarks:
     *   附注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_notes
     *
     * @mbg.generated
     */
    private String thesisNotes;

    /**
     * Database Column Remarks:
     *   论文关键字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_keywords
     *
     * @mbg.generated
     */
    private String thesisKeywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_school_code
     *
     * @mbg.generated
     */
    private String thesisSchoolCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_school_name
     *
     * @mbg.generated
     */
    private String thesisSchoolName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_subject_code
     *
     * @mbg.generated
     */
    private String thesisSubjectCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_subject_name
     *
     * @mbg.generated
     */
    private String thesisSubjectName;

    /**
     * Database Column Remarks:
     *   论文所属学位
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_author_degree
     *
     * @mbg.generated
     */
    private String thesisAuthorDegree;

    /**
     * Database Column Remarks:
     *   论文发表年度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_year
     *
     * @mbg.generated
     */
    private Integer thesisYear;

    /**
     * Database Column Remarks:
     *   委员会成员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_committee
     *
     * @mbg.generated
     */
    private String thesisCommittee;

    /**
     * Database Column Remarks:
     *   论文语言
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_lang
     *
     * @mbg.generated
     */
    private String thesisLang;

    /**
     * Database Column Remarks:
     *   论文出版地
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_publish_place
     *
     * @mbg.generated
     */
    private String thesisPublishPlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_country
     *
     * @mbg.generated
     */
    private String thesisCountry;

    /**
     * Database Column Remarks:
     *   1:博士，2:硕士
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_degree
     *
     * @mbg.generated
     */
    private String thesisDegree;

    /**
     * Database Column Remarks:
     *   1:正常，2:屏蔽库，3:黑名单
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_type
     *
     * @mbg.generated
     */
    private String thesisType;

    /**
     * Database Column Remarks:
     *   论文在当前中科PQDT系统的URL(暂时未用)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_url
     *
     * @mbg.generated
     */
    private String thesisUrl;

    /**
     * Database Column Remarks:
     *   论文状态:2未订购，3订购中，4订购成功，99不能提供
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_status
     *
     * @mbg.generated
     */
    private String thesisStatus;

    /**
     * Database Column Remarks:
     *   是否有全文
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_fulltext
     *
     * @mbg.generated
     */
    private String thesisFulltext;

    /**
     * Database Column Remarks:
     *   论文所属的订购批次
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.order_batch
     *
     * @mbg.generated
     */
    private Long orderBatch;

    /**
     * Database Column Remarks:
     *   购买年度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.purchase_year
     *
     * @mbg.generated
     */
    private Integer purchaseYear;

    /**
     * Database Column Remarks:
     *   论文购买机构
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.purchase_org
     *
     * @mbg.generated
     */
    private Long purchaseOrg;

    /**
     * Database Column Remarks:
     *   论文购买集团
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.purchase_group
     *
     * @mbg.generated
     */
    private Long purchaseGroup;

    /**
     * Database Column Remarks:
     *   所属MARC批次
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.marc_batch
     *
     * @mbg.generated
     */
    private Long marcBatch;

    /**
     * Database Column Remarks:
     *   实际存储的是XML导入的批次主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.pdf_batch
     *
     * @mbg.generated
     */
    private Long pdfBatch;

    /**
     * Database Column Remarks:
     *   上传的PDF的页数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.pdf_pages
     *
     * @mbg.generated
     */
    private Integer pdfPages;

    /**
     * Database Column Remarks:
     *   摘要
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_thesis.thesis_summary
     *
     * @mbg.generated
     */
    private String thesisSummary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.id
     *
     * @return the value of t_thesis.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.id
     *
     * @param id the value for t_thesis.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_code
     *
     * @return the value of t_thesis.thesis_code
     *
     * @mbg.generated
     */
    public String getThesisCode() {
        return thesisCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_code
     *
     * @param thesisCode the value for t_thesis.thesis_code
     *
     * @mbg.generated
     */
    public void setThesisCode(String thesisCode) {
        this.thesisCode = thesisCode == null ? null : thesisCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_title
     *
     * @return the value of t_thesis.thesis_title
     *
     * @mbg.generated
     */
    public String getThesisTitle() {
        return thesisTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_title
     *
     * @param thesisTitle the value for t_thesis.thesis_title
     *
     * @mbg.generated
     */
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle == null ? null : thesisTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_author
     *
     * @return the value of t_thesis.thesis_author
     *
     * @mbg.generated
     */
    public String getThesisAuthor() {
        return thesisAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_author
     *
     * @param thesisAuthor the value for t_thesis.thesis_author
     *
     * @mbg.generated
     */
    public void setThesisAuthor(String thesisAuthor) {
        this.thesisAuthor = thesisAuthor == null ? null : thesisAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_isbn
     *
     * @return the value of t_thesis.thesis_isbn
     *
     * @mbg.generated
     */
    public String getThesisIsbn() {
        return thesisIsbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_isbn
     *
     * @param thesisIsbn the value for t_thesis.thesis_isbn
     *
     * @mbg.generated
     */
    public void setThesisIsbn(String thesisIsbn) {
        this.thesisIsbn = thesisIsbn == null ? null : thesisIsbn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_pages
     *
     * @return the value of t_thesis.thesis_pages
     *
     * @mbg.generated
     */
    public String getThesisPages() {
        return thesisPages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_pages
     *
     * @param thesisPages the value for t_thesis.thesis_pages
     *
     * @mbg.generated
     */
    public void setThesisPages(String thesisPages) {
        this.thesisPages = thesisPages == null ? null : thesisPages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_source
     *
     * @return the value of t_thesis.thesis_source
     *
     * @mbg.generated
     */
    public String getThesisSource() {
        return thesisSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_source
     *
     * @param thesisSource the value for t_thesis.thesis_source
     *
     * @mbg.generated
     */
    public void setThesisSource(String thesisSource) {
        this.thesisSource = thesisSource == null ? null : thesisSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_adviser
     *
     * @return the value of t_thesis.thesis_adviser
     *
     * @mbg.generated
     */
    public String getThesisAdviser() {
        return thesisAdviser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_adviser
     *
     * @param thesisAdviser the value for t_thesis.thesis_adviser
     *
     * @mbg.generated
     */
    public void setThesisAdviser(String thesisAdviser) {
        this.thesisAdviser = thesisAdviser == null ? null : thesisAdviser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_notes
     *
     * @return the value of t_thesis.thesis_notes
     *
     * @mbg.generated
     */
    public String getThesisNotes() {
        return thesisNotes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_notes
     *
     * @param thesisNotes the value for t_thesis.thesis_notes
     *
     * @mbg.generated
     */
    public void setThesisNotes(String thesisNotes) {
        this.thesisNotes = thesisNotes == null ? null : thesisNotes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_keywords
     *
     * @return the value of t_thesis.thesis_keywords
     *
     * @mbg.generated
     */
    public String getThesisKeywords() {
        return thesisKeywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_keywords
     *
     * @param thesisKeywords the value for t_thesis.thesis_keywords
     *
     * @mbg.generated
     */
    public void setThesisKeywords(String thesisKeywords) {
        this.thesisKeywords = thesisKeywords == null ? null : thesisKeywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_school_code
     *
     * @return the value of t_thesis.thesis_school_code
     *
     * @mbg.generated
     */
    public String getThesisSchoolCode() {
        return thesisSchoolCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_school_code
     *
     * @param thesisSchoolCode the value for t_thesis.thesis_school_code
     *
     * @mbg.generated
     */
    public void setThesisSchoolCode(String thesisSchoolCode) {
        this.thesisSchoolCode = thesisSchoolCode == null ? null : thesisSchoolCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_school_name
     *
     * @return the value of t_thesis.thesis_school_name
     *
     * @mbg.generated
     */
    public String getThesisSchoolName() {
        return thesisSchoolName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_school_name
     *
     * @param thesisSchoolName the value for t_thesis.thesis_school_name
     *
     * @mbg.generated
     */
    public void setThesisSchoolName(String thesisSchoolName) {
        this.thesisSchoolName = thesisSchoolName == null ? null : thesisSchoolName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_subject_code
     *
     * @return the value of t_thesis.thesis_subject_code
     *
     * @mbg.generated
     */
    public String getThesisSubjectCode() {
        return thesisSubjectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_subject_code
     *
     * @param thesisSubjectCode the value for t_thesis.thesis_subject_code
     *
     * @mbg.generated
     */
    public void setThesisSubjectCode(String thesisSubjectCode) {
        this.thesisSubjectCode = thesisSubjectCode == null ? null : thesisSubjectCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_subject_name
     *
     * @return the value of t_thesis.thesis_subject_name
     *
     * @mbg.generated
     */
    public String getThesisSubjectName() {
        return thesisSubjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_subject_name
     *
     * @param thesisSubjectName the value for t_thesis.thesis_subject_name
     *
     * @mbg.generated
     */
    public void setThesisSubjectName(String thesisSubjectName) {
        this.thesisSubjectName = thesisSubjectName == null ? null : thesisSubjectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_author_degree
     *
     * @return the value of t_thesis.thesis_author_degree
     *
     * @mbg.generated
     */
    public String getThesisAuthorDegree() {
        return thesisAuthorDegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_author_degree
     *
     * @param thesisAuthorDegree the value for t_thesis.thesis_author_degree
     *
     * @mbg.generated
     */
    public void setThesisAuthorDegree(String thesisAuthorDegree) {
        this.thesisAuthorDegree = thesisAuthorDegree == null ? null : thesisAuthorDegree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_year
     *
     * @return the value of t_thesis.thesis_year
     *
     * @mbg.generated
     */
    public Integer getThesisYear() {
        return thesisYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_year
     *
     * @param thesisYear the value for t_thesis.thesis_year
     *
     * @mbg.generated
     */
    public void setThesisYear(Integer thesisYear) {
        this.thesisYear = thesisYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_committee
     *
     * @return the value of t_thesis.thesis_committee
     *
     * @mbg.generated
     */
    public String getThesisCommittee() {
        return thesisCommittee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_committee
     *
     * @param thesisCommittee the value for t_thesis.thesis_committee
     *
     * @mbg.generated
     */
    public void setThesisCommittee(String thesisCommittee) {
        this.thesisCommittee = thesisCommittee == null ? null : thesisCommittee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_lang
     *
     * @return the value of t_thesis.thesis_lang
     *
     * @mbg.generated
     */
    public String getThesisLang() {
        return thesisLang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_lang
     *
     * @param thesisLang the value for t_thesis.thesis_lang
     *
     * @mbg.generated
     */
    public void setThesisLang(String thesisLang) {
        this.thesisLang = thesisLang == null ? null : thesisLang.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_publish_place
     *
     * @return the value of t_thesis.thesis_publish_place
     *
     * @mbg.generated
     */
    public String getThesisPublishPlace() {
        return thesisPublishPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_publish_place
     *
     * @param thesisPublishPlace the value for t_thesis.thesis_publish_place
     *
     * @mbg.generated
     */
    public void setThesisPublishPlace(String thesisPublishPlace) {
        this.thesisPublishPlace = thesisPublishPlace == null ? null : thesisPublishPlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_country
     *
     * @return the value of t_thesis.thesis_country
     *
     * @mbg.generated
     */
    public String getThesisCountry() {
        return thesisCountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_country
     *
     * @param thesisCountry the value for t_thesis.thesis_country
     *
     * @mbg.generated
     */
    public void setThesisCountry(String thesisCountry) {
        this.thesisCountry = thesisCountry == null ? null : thesisCountry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_degree
     *
     * @return the value of t_thesis.thesis_degree
     *
     * @mbg.generated
     */
    public String getThesisDegree() {
        return thesisDegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_degree
     *
     * @param thesisDegree the value for t_thesis.thesis_degree
     *
     * @mbg.generated
     */
    public void setThesisDegree(String thesisDegree) {
        this.thesisDegree = thesisDegree == null ? null : thesisDegree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_type
     *
     * @return the value of t_thesis.thesis_type
     *
     * @mbg.generated
     */
    public String getThesisType() {
        return thesisType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_type
     *
     * @param thesisType the value for t_thesis.thesis_type
     *
     * @mbg.generated
     */
    public void setThesisType(String thesisType) {
        this.thesisType = thesisType == null ? null : thesisType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_url
     *
     * @return the value of t_thesis.thesis_url
     *
     * @mbg.generated
     */
    public String getThesisUrl() {
        return thesisUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_url
     *
     * @param thesisUrl the value for t_thesis.thesis_url
     *
     * @mbg.generated
     */
    public void setThesisUrl(String thesisUrl) {
        this.thesisUrl = thesisUrl == null ? null : thesisUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_status
     *
     * @return the value of t_thesis.thesis_status
     *
     * @mbg.generated
     */
    public String getThesisStatus() {
        return thesisStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_status
     *
     * @param thesisStatus the value for t_thesis.thesis_status
     *
     * @mbg.generated
     */
    public void setThesisStatus(String thesisStatus) {
        this.thesisStatus = thesisStatus == null ? null : thesisStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_fulltext
     *
     * @return the value of t_thesis.thesis_fulltext
     *
     * @mbg.generated
     */
    public String getThesisFulltext() {
        return thesisFulltext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_fulltext
     *
     * @param thesisFulltext the value for t_thesis.thesis_fulltext
     *
     * @mbg.generated
     */
    public void setThesisFulltext(String thesisFulltext) {
        this.thesisFulltext = thesisFulltext == null ? null : thesisFulltext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.order_batch
     *
     * @return the value of t_thesis.order_batch
     *
     * @mbg.generated
     */
    public Long getOrderBatch() {
        return orderBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.order_batch
     *
     * @param orderBatch the value for t_thesis.order_batch
     *
     * @mbg.generated
     */
    public void setOrderBatch(Long orderBatch) {
        this.orderBatch = orderBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.purchase_year
     *
     * @return the value of t_thesis.purchase_year
     *
     * @mbg.generated
     */
    public Integer getPurchaseYear() {
        return purchaseYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.purchase_year
     *
     * @param purchaseYear the value for t_thesis.purchase_year
     *
     * @mbg.generated
     */
    public void setPurchaseYear(Integer purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.purchase_org
     *
     * @return the value of t_thesis.purchase_org
     *
     * @mbg.generated
     */
    public Long getPurchaseOrg() {
        return purchaseOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.purchase_org
     *
     * @param purchaseOrg the value for t_thesis.purchase_org
     *
     * @mbg.generated
     */
    public void setPurchaseOrg(Long purchaseOrg) {
        this.purchaseOrg = purchaseOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.purchase_group
     *
     * @return the value of t_thesis.purchase_group
     *
     * @mbg.generated
     */
    public Long getPurchaseGroup() {
        return purchaseGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.purchase_group
     *
     * @param purchaseGroup the value for t_thesis.purchase_group
     *
     * @mbg.generated
     */
    public void setPurchaseGroup(Long purchaseGroup) {
        this.purchaseGroup = purchaseGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.marc_batch
     *
     * @return the value of t_thesis.marc_batch
     *
     * @mbg.generated
     */
    public Long getMarcBatch() {
        return marcBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.marc_batch
     *
     * @param marcBatch the value for t_thesis.marc_batch
     *
     * @mbg.generated
     */
    public void setMarcBatch(Long marcBatch) {
        this.marcBatch = marcBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.pdf_batch
     *
     * @return the value of t_thesis.pdf_batch
     *
     * @mbg.generated
     */
    public Long getPdfBatch() {
        return pdfBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.pdf_batch
     *
     * @param pdfBatch the value for t_thesis.pdf_batch
     *
     * @mbg.generated
     */
    public void setPdfBatch(Long pdfBatch) {
        this.pdfBatch = pdfBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.pdf_pages
     *
     * @return the value of t_thesis.pdf_pages
     *
     * @mbg.generated
     */
    public Integer getPdfPages() {
        return pdfPages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.pdf_pages
     *
     * @param pdfPages the value for t_thesis.pdf_pages
     *
     * @mbg.generated
     */
    public void setPdfPages(Integer pdfPages) {
        this.pdfPages = pdfPages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_thesis.thesis_summary
     *
     * @return the value of t_thesis.thesis_summary
     *
     * @mbg.generated
     */
    public String getThesisSummary() {
        return thesisSummary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_thesis.thesis_summary
     *
     * @param thesisSummary the value for t_thesis.thesis_summary
     *
     * @mbg.generated
     */
    public void setThesisSummary(String thesisSummary) {
        this.thesisSummary = thesisSummary == null ? null : thesisSummary.trim();
    }
}