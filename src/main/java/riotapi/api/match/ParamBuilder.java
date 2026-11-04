package riotapi.api.match;

import org.jetbrains.annotations.Nullable;

import java.util.StringJoiner;

// TODO: startTime InvalidArgument (June 16th 2021)
public record ParamBuilder(@Nullable Long startTime, @Nullable Long endTime, @Nullable Integer queue, @Nullable String type,
                           @Nullable Integer start, @Nullable Integer count) {
    public String build() {
        StringJoiner params = new StringJoiner("&");
        if (startTime != null)
            params.add("startTime=" + startTime);

        if (endTime != null)
            params.add("endTime=" + endTime);

        if (queue != null)
            params.add("queue=" + queue);

        if (type != null)
            params.add("type=" + type);

        if (start != null)
            params.add("start=" + start);

        if (count != null)
            params.add("count=" + count);

        String result = params.toString();
        return result.isEmpty() ? "" : "?" + result;
    }
}
