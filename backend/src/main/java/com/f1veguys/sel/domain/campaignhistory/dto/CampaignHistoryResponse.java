package com.f1veguys.sel.domain.campaignhistory.dto;

import com.f1veguys.sel.domain.campaignhistory.domain.CampaignHistory;

import java.time.LocalDateTime;

public record CampaignHistoryResponse(
        int campaignId,
        int userId,
        int amount,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
    public CampaignHistoryResponse(CampaignHistory campaignHistory, LocalDateTime startDate, LocalDateTime endDate) {
        this(campaignHistory.getCampaignId(), campaignHistory.getUserId(), campaignHistory.getAmount(),startDate, endDate);
    }
}