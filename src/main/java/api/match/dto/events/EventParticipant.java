package api.match.dto.events;

public record EventParticipant(boolean basic, int magicDamage, String name, int participantId, int physicalDamage, String spellName, int spellSlot, int trueDamage,
                               String type) {
}
