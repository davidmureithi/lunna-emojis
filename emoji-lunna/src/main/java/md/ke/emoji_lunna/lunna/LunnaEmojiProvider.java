/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package md.ke.emoji_lunna.lunna;

import androidx.annotation.NonNull;

import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.emoji.EmojiCategory;

import md.ke.emoji_lunna.lunna.category.ActivitiesCategory;
import md.ke.emoji_lunna.lunna.category.AnimalsAndNatureCategory;
import md.ke.emoji_lunna.lunna.category.FlagsCategory;
import md.ke.emoji_lunna.lunna.category.FoodAndDrinkCategory;
import md.ke.emoji_lunna.lunna.category.ObjectsCategory;
import md.ke.emoji_lunna.lunna.category.SmileysAndPeopleCategory;
import md.ke.emoji_lunna.lunna.category.SymbolsCategory;
import md.ke.emoji_lunna.lunna.category.TravelAndPlacesCategory;

public final class LunnaEmojiProvider implements EmojiProvider {
  @Override
  @NonNull
  public EmojiCategory[] getCategories() {
    return new EmojiCategory[] {
      new SmileysAndPeopleCategory(),
      new AnimalsAndNatureCategory(),
      new FoodAndDrinkCategory(),
      new ActivitiesCategory(),
      new TravelAndPlacesCategory(),
      new ObjectsCategory(),
      new SymbolsCategory(),
      new FlagsCategory()
    };
  }
}
