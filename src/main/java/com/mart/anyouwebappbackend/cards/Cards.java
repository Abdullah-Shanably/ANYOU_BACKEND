package com.mart.anyouwebappbackend.cards;

import jakarta.persistence.*;

@Entity
@Table(name = "cards")
public class Cards {
    @Id
    @SequenceGenerator(
            name = "card_sequence",
            sequenceName = "card_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Card_sequence")
    private long id;
    private String title;
    private String contant;
    private String image;
    private String memory;
    private String price;
    private String technology;
    private String announced;
    private String status;
    private String dimensions;
    private String weight;
    private String build;
    private String sim;
    private String type;
    private String size;
    private String resolution;
    private String protection;
    private String os;
    private String chipset;
    private String cpu;
    private String gpu;
    private String cardSlot;
    private String internal;

    public Cards() {
    }

    public Cards(long id, String title, String contant, String image, String memory, String price, String technology, String announced, String status, String dimensions, String weight, String build, String sim, String type, String size, String resolution, String protection, String os, String chipset, String cpu, String gpu, String cardSlot, String internal) {
        this.id = id;
        this.title = title;
        this.contant = contant;
        this.image = image;
        this.memory = memory;
        this.price = price;
        this.technology = technology;
        this.announced = announced;
        this.status = status;
        this.dimensions = dimensions;
        this.weight = weight;
        this.build = build;
        this.sim = sim;
        this.type = type;
        this.size = size;
        this.resolution = resolution;
        this.protection = protection;
        this.os = os;
        this.chipset = chipset;
        this.cpu = cpu;
        this.gpu = gpu;
        this.cardSlot = cardSlot;
        this.internal = internal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContant() {
        return contant;
    }

    public void setContant(String contant) {
        this.contant = contant;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getAnnounced() {
        return announced;
    }

    public void setAnnounced(String announced) {
        this.announced = announced;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCardSlot() {
        return cardSlot;
    }

    public void setCardSlot(String cardSlot) {
        this.cardSlot = cardSlot;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    @Override
    public String toString() {
        return "cards{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contant='" + contant + '\'' +
                ", image='" + image + '\'' +
                ", memory='" + memory + '\'' +
                ", price='" + price + '\'' +
                ", technology='" + technology + '\'' +
                ", announced='" + announced + '\'' +
                ", status='" + status + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", weight='" + weight + '\'' +
                ", build='" + build + '\'' +
                ", sim='" + sim + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", resolution='" + resolution + '\'' +
                ", protection='" + protection + '\'' +
                ", os='" + os + '\'' +
                ", chipset='" + chipset + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", cardSlot='" + cardSlot + '\'' +
                ", internal='" + internal + '\'' +
                '}';
    }
}
