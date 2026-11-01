package api.match;

import org.jetbrains.annotations.Nullable;
// TODO: startTime InvalidArgument (June 16th 2021)
public record ParamBuilder(@Nullable Long startTime, @Nullable Long endTime, @Nullable Integer queue, @Nullable String type,
                           @Nullable Integer start, @Nullable Integer count) {
    public String build() {
        String result = "?";
        result += startTime != null ? "startTime=" + startTime + "&" : "";
        result += endTime != null ? "endTime=" + endTime + "&": "";
        result += queue != null ? "queue=" + queue + "&": "";
        result += type != null ? "type=" + type + "&": "";
        result += start != null ? "start=" + start + "&": "";
        result += count != null ? "count=" + count + "&": "";
        return result;
    }
}
