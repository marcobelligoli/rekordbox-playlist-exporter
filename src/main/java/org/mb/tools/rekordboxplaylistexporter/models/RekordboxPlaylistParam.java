package org.mb.tools.rekordboxplaylistexporter.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class RekordboxPlaylistParam {

    private String playlistPath;
    private boolean maintainPlaylistOrder;
}
