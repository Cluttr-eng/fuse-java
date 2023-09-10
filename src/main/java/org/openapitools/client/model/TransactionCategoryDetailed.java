/*
 * Fuse
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Detailed transaction category
 */
@JsonAdapter(TransactionCategoryDetailed.Adapter.class)
public enum TransactionCategoryDetailed {
  
  AUTO_AND_TRANSPORT("auto_and_transport"),
  
  BILLS_AND_UTILITIES("bills_and_utilities"),
  
  BUSINESS_SERVICES("business_services"),
  
  EDUCATION("education"),
  
  ENTERTAINMENT("entertainment"),
  
  FEES_AND_CHARGES("fees_and_charges"),
  
  FINANCIAL("financial"),
  
  FOOD_AND_DINING("food_and_dining"),
  
  GIFTS_AND_DONATIONS("gifts_and_donations"),
  
  HEALTH_AND_FITNESS("health_and_fitness"),
  
  HOME("home"),
  
  INCOME("income"),
  
  INVESTMENTS("investments"),
  
  KIDS("kids"),
  
  PERSONAL_CARE("personal_care"),
  
  PETS("pets"),
  
  SHOPPING("shopping"),
  
  TAXES("taxes"),
  
  TRANSFER("transfer"),
  
  TRAVEL("travel"),
  
  AUTO_INSURANCE("auto_insurance"),
  
  AUTO_PAYMENT("auto_payment"),
  
  GAS("gas"),
  
  PARKING("parking"),
  
  PUBLIC_TRANSPORTATION("public_transportation"),
  
  SERVICE_AND_PARTS("service_and_parts"),
  
  DOMAIN_NAMES("domain_names"),
  
  FRAUD_PROTECTION("fraud_protection"),
  
  HOME_PHONE("home_phone"),
  
  HOSTING("hosting"),
  
  INTERNET("internet"),
  
  MOBILE_PHONE("mobile_phone"),
  
  TELEVISION("television"),
  
  UTILITIES("utilities"),
  
  ADVERTISING("advertising"),
  
  LEGAL("legal"),
  
  OFFICE_SUPPLIES("office_supplies"),
  
  PRINTING("printing"),
  
  SHIPPING("shipping"),
  
  BOOKS_AND_SUPPLIES("books_and_supplies"),
  
  STUDENT_LOAN("student_loan"),
  
  TUITION("tuition"),
  
  AMUSEMENT("amusement"),
  
  ARTS("arts"),
  
  MOVIES_AND_DVDS("movies_and_dvds"),
  
  MUSIC("music"),
  
  NEWSPAPERS_AND_MAGAZINES("newspapers_and_magazines"),
  
  ATM_FEE("atm_fee"),
  
  BANKING_FEE("banking_fee"),
  
  FINANCE_CHARGE("finance_charge"),
  
  LATE_FEE("late_fee"),
  
  SERVICE_FEE("service_fee"),
  
  TRADE_COMMISSIONS("trade_commissions"),
  
  FINANCIAL_ADVISOR("financial_advisor"),
  
  LIFE_INSURANCE("life_insurance"),
  
  ALCOHOL_AND_BARS("alcohol_and_bars"),
  
  COFFEE_SHOPS("coffee_shops"),
  
  FAST_FOOD("fast_food"),
  
  GROCERIES("groceries"),
  
  RESTAURANTS("restaurants"),
  
  CHARITY("charity"),
  
  GIFT("gift"),
  
  DENTIST("dentist"),
  
  DOCTOR("doctor"),
  
  EYECARE("eyecare"),
  
  GYM("gym"),
  
  HEALTH_INSURANCE("health_insurance"),
  
  PHARMACY("pharmacy"),
  
  SPORTS("sports"),
  
  FURNISHINGS("furnishings"),
  
  HOME_IMPROVEMENT("home_improvement"),
  
  HOME_INSURANCE("home_insurance"),
  
  HOME_SERVICES("home_services"),
  
  HOME_SUPPLIES("home_supplies"),
  
  LAWN_AND_GARDEN("lawn_and_garden"),
  
  MORTGAGE_AND_RENT("mortgage_and_rent"),
  
  BONUS("bonus"),
  
  INTEREST_INCOME("interest_income"),
  
  PAYCHECK("paycheck"),
  
  REIMBURSEMENT("reimbursement"),
  
  RENTAL_INCOME("rental_income"),
  
  RETURNED_PURCHASE("returned_purchase"),
  
  BUY("buy"),
  
  DEPOSIT("deposit"),
  
  DIVIDEND_AND_CAP_GAINS("dividend_and_cap_gains"),
  
  SELL("sell"),
  
  WITHDRAWAL("withdrawal"),
  
  ALLOWANCE("allowance"),
  
  BABY_SUPPLIES("baby_supplies"),
  
  BABYSITTER_AND_DAYCARE("babysitter_and_daycare"),
  
  CHILD_SUPPORT("child_support"),
  
  KIDS_ACTIVITIES("kids_activities"),
  
  TOYS("toys"),
  
  HAIR("hair"),
  
  LAUNDRY("laundry"),
  
  SPA_AND_MASSAGE("spa_and_massage"),
  
  PET_FOOD_AND_SUPPLIES("pet_food_and_supplies"),
  
  PET_GROOMING("pet_grooming"),
  
  VETERINARY("veterinary"),
  
  BOOKS("books"),
  
  CLOTHING("clothing"),
  
  HOBBIES("hobbies"),
  
  SPORTING_GOODS("sporting_goods"),
  
  FEDERAL_TAX("federal_tax"),
  
  LOCAL_TAX("local_tax"),
  
  PROPERTY_TAX("property_tax"),
  
  SALES_TAX("sales_tax"),
  
  STATE_TAX("state_tax"),
  
  CREDIT_CARD_PAYMENT("credit_card_payment"),
  
  TRANSFER_FOR_CASH_SPENDING("transfer_for_cash_spending"),
  
  MORTGAGE_PAYMENT("mortgage_payment"),
  
  AIR_TRAVEL("air_travel"),
  
  HOTEL("hotel"),
  
  RENTAL_CAR_AND_TAXI("rental_car_and_taxi"),
  
  VACATION("vacation"),
  
  CASH("cash"),
  
  CHECK("check"),
  
  UNCATEGORIZED("uncategorized");

  private String value;

  TransactionCategoryDetailed(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionCategoryDetailed fromValue(String value) {
    for (TransactionCategoryDetailed b : TransactionCategoryDetailed.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransactionCategoryDetailed> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionCategoryDetailed enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionCategoryDetailed read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionCategoryDetailed.fromValue(value);
    }
  }
}

