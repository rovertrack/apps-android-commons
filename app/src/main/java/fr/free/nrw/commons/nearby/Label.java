package fr.free.nrw.commons.nearby;

import android.os.Parcel;

import androidx.annotation.DrawableRes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.free.nrw.commons.R;
import java.util.Objects;

/**
 * See https://github.com/commons-app/apps-android-commons/issues/250
 * Most common types of desc: building, house, cottage, farmhouse,
 * village, civil parish, church, railway station,
 * gatehouse, milestone, inn, secondary school, hotel
 */
public enum Label {

    BOOKMARKS(List.of("BOOKMARK"), R.drawable.ic_filled_star_24dp),
    BUILDING(PlaceClassQIds.BUILDING, R.drawable.round_icon_generic_building),
    BANK(PlaceClassQIds.BANK, R.drawable.round_icon_bank),
    HOSPITAL(PlaceClassQIds.HOSPITAL, R.drawable.round_icon_hospital),
    HOUSE(PlaceClassQIds.HOUSE, R.drawable.round_icon_house),
    COTTAGE(PlaceClassQIds.COTTAGE, R.drawable.round_icon_house),
    FARMHOUSE(PlaceClassQIds.FARMHOUSE, R.drawable.round_icon_house),
    CHURCH(PlaceClassQIds.CHURCH, R.drawable.round_icon_church),
    GAS_STATION(List.of("Q128302279"), R.drawable.round_icon_gas_station),
    RAILWAY_STATION(PlaceClassQIds.RAILWAY_STATION, R.drawable.round_icon_railway_station),
    GATEHOUSE(PlaceClassQIds.GATEHOUSE, R.drawable.round_icon_gatehouse),
    MILESTONE(PlaceClassQIds.MILESTONE, R.drawable.round_icon_milestone),
    INN(PlaceClassQIds.INN, R.drawable.round_icon_house),
    HOTEL(PlaceClassQIds.HOTEL, R.drawable.round_icon_house),
    CITY(PlaceClassQIds.CITY, R.drawable.round_icon_city),
    UNIVERSITY(PlaceClassQIds.UNIVERSITY, R.drawable.round_icon_school),
    SCHOOL(PlaceClassQIds.SCHOOL, R.drawable.round_icon_school),
    EDUCATION(PlaceClassQIds.EDUCATION, R.drawable.round_icon_school),
    ISLE(PlaceClassQIds.ISLE, R.drawable.round_icon_island),
    MOUNTAIN(PlaceClassQIds.MOUNTAIN, R.drawable.round_icon_mountain),
    AIRPORT(PlaceClassQIds.AIRPORT, R.drawable.round_icon_airport),
    BRIDGE(PlaceClassQIds.BRIDGE, R.drawable.round_icon_bridge),
    ROAD(PlaceClassQIds.ROAD, R.drawable.round_icon_road),
    FOREST(PlaceClassQIds.FOREST, R.drawable.round_icon_forest),
    PARK(PlaceClassQIds.PARK, R.drawable.round_icon_park),
    RIVER(PlaceClassQIds.RIVER, R.drawable.round_icon_river),
    WATERFALL(PlaceClassQIds.WATERFALL, R.drawable.round_icon_waterfall),
    TEMPLE(PlaceClassQIds.TEMPLE, R.drawable.round_icon_church),
    UNKNOWN(List.of("?"), R.drawable.round_icon_unknown);

    /**
     * Inner holder class where each constant can self-register its Q-IDs.
     */
    private static final class Holder {

        static final Map<String, Label> MAP = new HashMap<>();
    }

    /**
     * lookup map which maps  Q-ID -> Label.
     */
    public static final Map<String, Label> TEXT_TO_DESCRIPTION;

    static {
        TEXT_TO_DESCRIPTION = Collections.unmodifiableMap(Holder.MAP);
    }

    private final List<String> texts;
    @DrawableRes
    private final int icon;
    private boolean selected;

    Label(final List<String> texts, @DrawableRes final int icon) {
        this.texts = texts;
        this.icon = icon;

        for (final String text : texts) {
            Holder.MAP.put(text, this);
        }
    }

    Label(final Parcel in) {
        this.texts = Arrays.asList(Objects.requireNonNull(in.createStringArray()));
        this.icon = in.readInt();
    }

    /**
     * Will be used for nearby filter, to determine if place type is selected or not
     *
     * @param isSelected true if user selected the place type
     */
    public void setSelected(final boolean isSelected) {
        this.selected = isSelected;
    }

    public boolean isSelected() {
        return selected;
    }

    public String getText() {
        return texts.get(0);
    }

    @DrawableRes
    public int getIcon() {
        return icon;
    }

    public static Label fromText(final String text) {
        final Label label = TEXT_TO_DESCRIPTION.get(text);
        return label == null ? UNKNOWN : label;
    }

    public static List<Label> valuesAsList() {
        return Arrays.asList(Label.values());
    }
}