/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.view.contentcapture;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.ActivityThread;
import android.content.LocusId;
import android.os.Parcel;
import android.os.Parcelable;

import com.android.internal.util.DataClass;

import java.util.Objects;

/** Container class representing a request to share data with Content Capture service. */
@DataClass(
        genConstructor = false,
        genEqualsHashCode = true,
        genHiddenConstDefs = true,
        genParcelable = true,
        genToString = true
)
public final class DataShareRequest implements Parcelable {

    /** Name of the package making the request. */
    @NonNull private final String mPackageName;

    /** Locus id helping to identify what data is being shared. */
    @Nullable private final LocusId mLocusId;

    /** MIME type of the data being shared. */
    @NonNull private final String mMimeType;

    /** Constructs a request to share data with the Content Capture Service. */
    public DataShareRequest(@Nullable LocusId locusId, @NonNull String mimeType) {
        Objects.requireNonNull(mimeType);

        mPackageName = ActivityThread.currentActivityThread().getApplication().getPackageName();
        mLocusId = locusId;
        mMimeType = mimeType;
    }



    // Code below generated by codegen v1.0.14.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/core/java/android/view/contentcapture/DataShareRequest.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    /**
     * Name of the package making the request.
     */
    @DataClass.Generated.Member
    public @NonNull String getPackageName() {
        return mPackageName;
    }

    /**
     * Locus id helping to identify what data is being shared.
     */
    @DataClass.Generated.Member
    public @Nullable LocusId getLocusId() {
        return mLocusId;
    }

    /**
     * MIME type of the data being shared.
     */
    @DataClass.Generated.Member
    public @NonNull String getMimeType() {
        return mMimeType;
    }

    @Override
    @DataClass.Generated.Member
    public String toString() {
        // You can override field toString logic by defining methods like:
        // String fieldNameToString() { ... }

        return "DataShareRequest { " +
                "packageName = " + mPackageName + ", " +
                "locusId = " + mLocusId + ", " +
                "mimeType = " + mMimeType +
        " }";
    }

    @Override
    @DataClass.Generated.Member
    public boolean equals(@Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(DataShareRequest other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        DataShareRequest that = (DataShareRequest) o;
        //noinspection PointlessBooleanExpression
        return true
                && java.util.Objects.equals(mPackageName, that.mPackageName)
                && java.util.Objects.equals(mLocusId, that.mLocusId)
                && java.util.Objects.equals(mMimeType, that.mMimeType);
    }

    @Override
    @DataClass.Generated.Member
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + java.util.Objects.hashCode(mPackageName);
        _hash = 31 * _hash + java.util.Objects.hashCode(mLocusId);
        _hash = 31 * _hash + java.util.Objects.hashCode(mMimeType);
        return _hash;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        byte flg = 0;
        if (mLocusId != null) flg |= 0x2;
        dest.writeByte(flg);
        dest.writeString(mPackageName);
        if (mLocusId != null) dest.writeTypedObject(mLocusId, flags);
        dest.writeString(mMimeType);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ DataShareRequest(@NonNull Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        byte flg = in.readByte();
        String packageName = in.readString();
        LocusId locusId = (flg & 0x2) == 0 ? null : (LocusId) in.readTypedObject(LocusId.CREATOR);
        String mimeType = in.readString();

        this.mPackageName = packageName;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mPackageName);
        this.mLocusId = locusId;
        this.mMimeType = mimeType;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mMimeType);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<DataShareRequest> CREATOR
            = new Parcelable.Creator<DataShareRequest>() {
        @Override
        public DataShareRequest[] newArray(int size) {
            return new DataShareRequest[size];
        }

        @Override
        public DataShareRequest createFromParcel(@NonNull Parcel in) {
            return new DataShareRequest(in);
        }
    };

    @DataClass.Generated(
            time = 1579870254459L,
            codegenVersion = "1.0.14",
            sourceFile = "frameworks/base/core/java/android/view/contentcapture/DataShareRequest.java",
            inputSignatures = "private final @android.annotation.NonNull java.lang.String mPackageName\nprivate final @android.annotation.Nullable android.content.LocusId mLocusId\nprivate final @android.annotation.NonNull java.lang.String mMimeType\nclass DataShareRequest extends java.lang.Object implements [android.os.Parcelable]\n@com.android.internal.util.DataClass(genConstructor=false, genEqualsHashCode=true, genHiddenConstDefs=true, genParcelable=true, genToString=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}