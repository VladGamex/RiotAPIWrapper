package api.match.dto.events;

import api.match.dto.PositionDto;

import java.util.List;

public record EventsTimeLineDto(
        long timestamp, Long realTimestamp, String type,
        // Items
        Integer participantId, Integer itemId, Integer beforeId, Integer afterId, Integer goldGain,
        // Level und Skills
        Integer level, Integer skillSlot, String levelUpType,
        // Wards
        Integer creatorId, String wardType,
        // Kills
        Integer killerId, Integer victimId, List<Integer> assistingParticipantIds,
        Integer bounty, Integer shutdownBounty, Integer killStreakLength,
        Integer multiKillLength, String killType, PositionDto position,
        List<EventParticipant> victimDamageDealt, List<EventParticipant> victimDamageReceived,
        List<EventParticipant> victimTeamfightDamageDealt, List<EventParticipant> victimTeamfightDamageReceived,
        // Gebäude und Objectives
        Integer teamId, Integer killerTeamId, String laneType, String buildingType, String towerType,
        String monsterType, String monsterSubType, String transformType,
        // Sonstiges
        String name, Long actualStartTime, Integer winningTeam, Long gameId) {}
