package com.csye6225.fall2018.courseservice.datamodel;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="announcement")
public class Announcement {
	private String id;
	private long announcementId;
	private String announcementText;
	private long boardId;

	public Announcement() {

	}

	public Announcement(String id, long announcementId, String announcementText, long boardId) {
		this.id = id;
		this.announcementId = announcementId;
		this.announcementText = announcementText;
		this.boardId = boardId;
	}
	
	@DynamoDBIndexRangeKey(attributeName = "announcementId", globalSecondaryIndexName = "boardId-announcementId-index")
	public long getAnnouncementId() {
		return announcementId;
	}

	public void setAnnouncementId(long announcementId) {
		this.announcementId = announcementId;
	}

	@DynamoDBAttribute(attributeName = "announcementText")
	public String getAnnouncementText() {
		return announcementText;
	}

	public void setAnnouncementText(String announcementText) {
		this.announcementText = announcementText;
	}

	@DynamoDBIndexHashKey(attributeName = "boardId", globalSecondaryIndexName = "boardId-announcementId-index")
	public long getBoardId() {
		return boardId;
	}

	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}

	@DynamoDBHashKey(attributeName = "id")
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBIgnore
	@Override
	public String toString() {
		return "AnnouncementID=" + getAnnouncementId() + ", announcementText=" + getAnnouncementText() + ", boardId="
				+ getBoardId();
	}
}
