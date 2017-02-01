/*
 * Copyright (C) 2017 Jacob Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.klinker.android.article.data;

import android.database.MatrixCursor;

import org.junit.Test;

import xyz.klinker.android.article.ArticleRobolectricSuite;

import static org.junit.Assert.assertEquals;

public class CategoryTest extends ArticleRobolectricSuite {

    @Test
    public void fillFromCursor() {
        MatrixCursor cursor = new MatrixCursor(new String[] {
                "name",
                "count"
        });

        cursor.addRow(new Object[] {
                "test",
                5
        });

        cursor.moveToFirst();
        Category category = new Category(cursor);

        assertEquals("test", category.name);
        assertEquals(5, category.numberArticles);
    }
}
