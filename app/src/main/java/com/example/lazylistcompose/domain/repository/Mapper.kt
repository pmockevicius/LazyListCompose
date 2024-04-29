package com.example.lazylistcompose.domain.repository

interface Mapper<DomainEntity, DataEntity> {
    fun toEntity(dataEntity: DataEntity): DomainEntity
    fun toData(domainEntity: DomainEntity): DataEntity
}


